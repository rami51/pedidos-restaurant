package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.usuario.Usuario;
import com.utn.rjmg.pedrest.repository.usuario.UsuarioRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.usuario.UsuarioService;

@Service
public class UsuarioServiceImpl 
extends AbstractBaseCrudService<Usuario, UsuarioRepository> 
implements UsuarioService {

}
