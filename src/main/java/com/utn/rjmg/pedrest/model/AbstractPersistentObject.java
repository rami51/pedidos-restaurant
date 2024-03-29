package com.utn.rjmg.pedrest.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Version;
import org.springframework.security.core.Authentication;

import com.utn.rjmg.pedrest.util.MethodUtil;
import com.utn.rjmg.pedrest.util.SecurityUtil;

@MappedSuperclass
public abstract class AbstractPersistentObject {
	
	@Transient
	private static List<String> excludedToStringAnnotations = 
		Arrays.asList(	OneToMany.class.getSimpleName(), 
						ManyToOne.class.getSimpleName(), 
						Transient.class.getSimpleName());
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	
	protected String modificationUser;
	
	@CreationTimestamp
	protected Date creationTime;
	
	@UpdateTimestamp
	protected Date modificationTime;
	
	@Version
	protected Integer version;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModificationUser() {
		return modificationUser;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public Date getModificationTime() {
		return modificationTime;
	}
	public Integer getVersion() {
		return version;
	}
	
	@Override
	@Transient
	public String toString() {
		String base = this.getClass().getSimpleName() + " ["
				+ "id=" + id 
				+ ", modificationUser=" + modificationUser 
				+ ", creationTime=" + creationTime 
				+ ", modificationTime=" + modificationTime;
		StringBuilder sb = new StringBuilder(); 
		sb.append(base);
		Class<?> c = this.getClass();
		ArrayList<Method> methodList = new ArrayList<Method>(Arrays.asList(c.getMethods()));
		methodList.forEach((method) -> {
			List<Annotation> annotations = Arrays.asList(method.getAnnotations());
			if (MethodUtil.isGetter(method) 
					&& !annotations.stream().anyMatch((a) -> 
					excludedToStringAnnotations.contains(a.annotationType().getSimpleName()))) {
				try {
					sb.append(", ");
					sb.append(method.getName());
					sb.append("=");
					sb.append(method.invoke(this));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		sb.append("]");
		return sb.toString();
	}
	
	@PreUpdate
	@PrePersist
	public void prePersist() {
		Authentication auth = SecurityUtil.getCurrentAuthentication();
		if (auth != null) {
			this.modificationUser = auth.getName();
		}
		if (version == null) {
			version = -1;
		}
		version++;
	}
	
}
