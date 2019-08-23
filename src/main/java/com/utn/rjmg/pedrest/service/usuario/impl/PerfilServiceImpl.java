package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.usuario.Perfil;
import com.utn.rjmg.pedrest.repository.usuario.PerfilRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.usuario.PerfilService;

@Service
public class PerfilServiceImpl extends AbstractBaseService<Perfil, PerfilRepository> 
implements PerfilService {

}
