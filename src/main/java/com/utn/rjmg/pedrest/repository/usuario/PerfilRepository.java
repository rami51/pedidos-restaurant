package com.utn.rjmg.pedrest.repository.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.usuario.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{
	
}
