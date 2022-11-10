package com.info2022b.informatorio.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info2022b.informatorio.entity.Usuario;
import com.info2022b.informatorio.service.IUsuario;

@RequestMapping("/api/user")
@RestController
public class UsuarioController {
	
	@Autowired
	public IUsuario usuarioService;
	
	@GetMapping("")
	public String home() {
		return "Bienvenidos a mi Api";
	}
	
	@GetMapping("/all")
	public ResponseEntity<HashMap<String, Object>> todosLosUsuarios(){
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<Usuario> usuarios = usuarioService.findAll();
		
		response.put("users", usuarios);
		
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
	}
	
	
	@GetMapping("/{idUser}")
	public ResponseEntity<HashMap<String, Object>> usuarioPorId(@PathVariable( value ="idUser") Long id) {
		HashMap<String, Object> response = new HashMap<String, Object>();
		Usuario usuario = usuarioService.findById(id);
		
		response.put("users", usuario);
		
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
	}

}
