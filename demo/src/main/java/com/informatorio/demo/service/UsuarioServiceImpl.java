package com.informatorio.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatorio.demo.dao.IUsuarioDao;
import com.informatorio.demo.entity.Usuario;


@Service
public class UsuarioServiceImpl {

	/*
	@Autowired
	private IUsuarioDao usuarioDao;
	*/
	
	public String save(String usuario) {
		// Aqui iria toda la logica para guardar el usuario en la DB
		
		//return usuarioDao.save(usuario);
		return "El Usuario "+usuario+" fue guardado Correctamente";
	}
	

}
