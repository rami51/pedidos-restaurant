package com.utn.rjmg.pedrest.service.factura.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.repository.factura.FacturaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.factura.FacturaService;

@Service
public class FacturaServiceImpl extends AbstractBaseService<Factura, FacturaRepository> 
implements FacturaService {

}
