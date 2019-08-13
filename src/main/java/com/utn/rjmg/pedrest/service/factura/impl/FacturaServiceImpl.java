package com.utn.rjmg.pedrest.service.factura.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.repository.factura.FacturaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.factura.FacturaService;

@Service
public class FacturaServiceImpl extends AbstractBaseCrudService<Factura, FacturaRepository> 
implements FacturaService {

}
