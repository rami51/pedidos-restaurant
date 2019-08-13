package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.usuario.UsuarioPerfil;
import com.utn.rjmg.pedrest.repository.usuario.UsuarioPerfilRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.usuario.UsuarioPerfilService;

@Service
public class UsuarioPerfilServiceImpl 
extends AbstractBaseCrudService<UsuarioPerfil, UsuarioPerfilRepository> 
implements UsuarioPerfilService {

}
