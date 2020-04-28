package com.examen.persona.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.persona.dto.Persona;

public interface IPersonaDAO  extends JpaRepository<Persona, Long>{

}
