package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.ItemComidaPedido;
import com.utn.rjmg.pedrest.repository.comida.ItemComidaPedidoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.ItemComidaPedidoService;

@Service
public class ItemComidaPedidoServiceImpl 
	extends AbstractBaseService<ItemComidaPedido, ItemComidaPedidoRepository> 
	implements ItemComidaPedidoService {
	
}
