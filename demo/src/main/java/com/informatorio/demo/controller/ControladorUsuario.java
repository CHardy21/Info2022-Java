package com.informatorio.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.slf4j.LoggerFactory;
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

@RequestMapping("/spring-api/v1/")
@RestController

public class ControladorUsuario {

	private org.slf4j.Logger log = LoggerFactory.getLogger(ControladorUsuario.class); 
	
	@Autowired
	private UsuarioServiceImpl UsuarioService;
	
	
	
	@GetMapping("/")
	public String inicio() {
		return "Hola desde INICIO";
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<HashMap<String, Object>> inicio(@PathVariable( value ="idUser") Long id, @PathParam(value = "pais") String pais) {
		HashMap<String, Object> response = new HashMap<>();
		
		if (id==5) {
			Usuario usuario = new Usuario((long) 5,"Christian","Hardy", new Date(27-9-1976));
			response.put("user", usuario);
			response.put("msg", "Usuario encontrado con Exito!!!");
			
			log.info(pais);
			
			return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.OK);
			
		}else {
			
			response.put("msg", "Usuario no encontrado.");
			
			return new ResponseEntity<HashMap<String, Object>>(response,HttpStatus.NOT_FOUND);
			
		}
		
	}
	

	@PostMapping("/crearUsuario")
	public String crearUsuario(@RequestBody String usuarioNombre) {
		return UsuarioService.save(usuarioNombre);
	}
	
}
