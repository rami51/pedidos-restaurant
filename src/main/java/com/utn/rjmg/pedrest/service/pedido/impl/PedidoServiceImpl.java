package com.utn.rjmg.pedrest.service.pedido.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.repository.pedido.PedidoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.pedido.PedidoService;

@Service
public class PedidoServiceImpl extends AbstractBaseService<Pedido, PedidoRepository> 
implements PedidoService {

}
