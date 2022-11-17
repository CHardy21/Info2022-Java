package com.chardy.springPacientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chardy.springPacientes.entity.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long>{}
