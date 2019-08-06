package com.utn.rjmg.pedrest.repository.pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.pedido.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long>{
	
}
