package com.utn.rjmg.pedrest.repository.permiso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.usuario.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long>{
	
}
