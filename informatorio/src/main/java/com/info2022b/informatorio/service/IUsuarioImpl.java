package com.info2022b.informatorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info2022b.informatorio.entity.Usuario;
import com.info2022b.informatorio.repository.IUsuarioDao;


@Service
public class IUsuarioImpl implements IUsuario{
	
	@Autowired
	IUsuarioDao usuarioDao;

	@Override
	public Usuario findById(Long id) {
		
		return usuarioDao.findById(id).orElse(new Usuario());
	}

	@Override
	public List<Usuario> findAll() {
		
		return usuarioDao.findAll();
	}



}
