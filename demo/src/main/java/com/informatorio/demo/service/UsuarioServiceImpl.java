package com.informatorio.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatorio.demo.dao.IUsuarioDao;
import com.informatorio.demo.entity.Usuario;


@Service
public class UsuarioServiceImpl {
/*
	//@Autowired
	private IUsuarioDao usuarioDao;
	
	public Usuario save(Usuario usuario) {
		
		// codigo que guarda el usuario 
		
		return usuarioDao.save(usuario);
	}
*/	
	public String save(String usuario) {
		return "El usuario fue guardado correctamente."+ usuario;
	
	}

}
