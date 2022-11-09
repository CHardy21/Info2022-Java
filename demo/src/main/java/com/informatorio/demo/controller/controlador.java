package com.informatorio.demo.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.demo.entity.Usuario;
import com.informatorio.demo.service.UsuarioServiceImpl;

@RequestMapping("/spring-api/v1")
@RestController

public class controlador {
	
	@Autowired
	private UsuarioServiceImpl usuarioService;
	

	@GetMapping("/")
	public ResponseEntity<HashMap<String, Object>> inicio() {
		HashMap<String, Object> response = new HashMap<>();
		response.put("msg", "Bienvenido a la pagina de inicio.");
		
		return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);

	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<HashMap<String, Object>> inicio(@PathVariable( value ="idUser") Long id) {
		HashMap<String, Object> response = new HashMap<>();
		
		if (id==5) {
			Usuario usuario = new Usuario((long) 5,"Christian","Hardy", new Date(1976,9,27));
			response.put("user", usuario);
			response.put("msg", "Usuario encontrado con Exito!!!");
			
			return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);
			
		}else {
			
			response.put("msg", "Usuario no encontrado.");
			
			return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.NOT_FOUND);
			
		}
		
	}
	

	@PostMapping("/")
	public String inicioPost() {
		return "Hola desde INICIO por Post";
	}
	
	
	@PostMapping("/save")
	public String save(@RequestBody String nombreUsuario) {
		
		return usuarioService.save(nombreUsuario);
		
	}
	
}
