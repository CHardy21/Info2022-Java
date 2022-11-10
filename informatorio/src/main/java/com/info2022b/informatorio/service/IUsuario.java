package com.info2022b.informatorio.service;

import java.util.List;

import com.info2022b.informatorio.entity.Usuario;

public interface IUsuario {
	
	public Usuario findById(Long id);
	public List<Usuario> findAll();

}
