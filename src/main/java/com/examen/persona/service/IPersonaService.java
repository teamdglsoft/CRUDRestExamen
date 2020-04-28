package com.examen.persona.service;

import java.util.List;

import com.examen.persona.dto.Persona;

public interface IPersonaService {
	
	public List<Persona> listarPersonas();
	
	public Persona guardarPersona(Persona persona);
	
	public Persona personaXID(Long id);
	
	public Persona actualizarPersona(Persona persona);
	
	public void eliminarPersona(Long id);

}
