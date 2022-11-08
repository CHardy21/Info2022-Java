package com.informatorio.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.demo.entity.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository< Usuario, Long >{

}
