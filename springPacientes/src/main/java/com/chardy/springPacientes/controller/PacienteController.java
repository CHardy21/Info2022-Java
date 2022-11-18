package com.chardy.springPacientes.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chardy.springPacientes.entity.Paciente;
import com.chardy.springPacientes.service.IPacienteService;


@RequestMapping("/paciente")
@RestController
public class PacienteController {
	
	
	@Autowired
	IPacienteService pacienteService;
	
	@GetMapping("")
	public String home() {
		return "Bienvenidos a mi ApiRest con Spring";
	}

	@GetMapping("/all")
	public ResponseEntity<HashMap<String, Object>> todosLosPacientes(){
		HashMap<String, Object> response = new HashMap<String, Object>();
		List<Paciente> pacientes = pacienteService.findAll();
		
		response.put("status", "ok");
		response.put("items", pacientes);
		
		
		return new ResponseEntity<HashMap<String, Object>>(response, HttpStatus.OK);
	}
}
