package com.utn.rjmg.pedrest.controller.pedido;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.service.pedido.PedidoService;
import com.utn.rjmg.pedrest.specification.pedido.PedidoSpecification;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends AbstractBaseRestController<Pedido, PedidoService, PedidoSpecification> {
	
}
