package com.utn.rjmg.pedrest.repository.comida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.comida.ItemComidaMenuDia;

@Repository
public interface ItemComidaMenuDiaRepository extends JpaRepository<ItemComidaMenuDia, Long>{
	
}
