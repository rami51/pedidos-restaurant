package com.utn.rjmg.pedrest.configuration.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.utn.rjmg.pedrest.model.usuario.Usuario;
import com.utn.rjmg.pedrest.repository.usuario.UsuarioRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Transactional(readOnly = true)
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.getUsuarioByUsername(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("User not found");
		}
		log.info("loadByUsername() : {}", username);
		
		return null;
	}

}
