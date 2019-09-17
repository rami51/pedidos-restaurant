package com.utn.rjmg.pedrest.controller.factura;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.service.factura.FacturaService;
import com.utn.rjmg.pedrest.specification.factura.FacturaSpecification;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends AbstractBaseRestController<Factura, FacturaService, FacturaSpecification> {
	
}
