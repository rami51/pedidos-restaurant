package com.utn.rjmg.pedrest.service.pedido.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.model.pedido.Horario;
import com.utn.rjmg.pedrest.repository.factura.FacturaRepository;
import com.utn.rjmg.pedrest.repository.pedido.HorarioRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.factura.FacturaService;
import com.utn.rjmg.pedrest.service.pedido.HorarioService;

@Service
public class HorarioServiceImpl extends AbstractBaseCrudService<Horario, HorarioRepository> 
implements HorarioService {

}
