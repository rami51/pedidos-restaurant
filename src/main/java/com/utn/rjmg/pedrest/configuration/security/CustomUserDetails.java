package com.utn.rjmg.pedrest.configuration.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.utn.rjmg.pedrest.model.usuario.Perfil;
import com.utn.rjmg.pedrest.model.usuario.PerfilPermiso;
import com.utn.rjmg.pedrest.model.usuario.Permiso;
import com.utn.rjmg.pedrest.model.usuario.Usuario;
import com.utn.rjmg.pedrest.model.usuario.UsuarioPerfil;

public class CustomUserDetails implements UserDetails {
	private static final long serialVersionUID = 8945907483084344294L;
	private Usuario usuario;
	
	public CustomUserDetails(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<UsuarioPerfil> usuarioPerfilList = usuario.getUsuarioPerfilList();
		List<Perfil> perfilList = usuarioPerfilList.stream()
				.map(UsuarioPerfil::getPerfil).collect(Collectors.toList());
		List<PerfilPermiso> perfilPermisoList = perfilList.stream()
				.flatMap(pp -> pp.getPerfilPermisoList().stream()).collect(Collectors.toList());
		List<Permiso> permisoList = perfilPermisoList.stream().map(PerfilPermiso::getPermiso).collect(Collectors.toList());
		
		return permisoList.stream().map(permiso -> new SimpleGrantedAuthority(permiso.getCodigo())).collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return this.usuario.getPassword();
	}

	@Override
	public String getUsername() {
		return this.usuario.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public Usuario getUserDetails() {
		return usuario;
	}
}
