package com.chardy.springPacientes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chardy.springPacientes.entity.Paciente;
import com.chardy.springPacientes.repository.IPacienteRepository;


@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	IPacienteRepository pacienteRepository;

	@Override
	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}



}
