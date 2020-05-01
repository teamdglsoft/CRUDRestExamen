package com.examen.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.persona.dto.Persona;
import com.examen.persona.service.PersonaServiceImpl;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,
		RequestMethod.POST,
		RequestMethod.DELETE,
		RequestMethod.PUT})
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	PersonaServiceImpl personaServiceImpl;
	
	@GetMapping("/personas")
	public List<Persona> listarPersonas() {
		return personaServiceImpl.listarPersonas();
	}
	
	@PostMapping("/personas")
	public Persona agregarPersona(@RequestBody Persona persona) {
		return personaServiceImpl.guardarPersona(persona);
	}
	
	@GetMapping("/personas/{id}")
	public Persona personaXID(@PathVariable(name = "id") Long id) {
		try {
			
		
		Persona persona_id = new Persona();
		persona_id = personaServiceImpl.personaXID(id);
		return persona_id;
		} catch (Exception e) {
			return null;
		}
	}
	
	@PutMapping("personas/{id}")
	public Persona actualizarPersona(@PathVariable(name = "id") Long id,
			@RequestBody Persona persona) {
		Persona personaSelected = new Persona();
		Persona personaUpdate = new Persona();
		
		personaSelected = personaServiceImpl.personaXID(id);
		
		personaSelected.setNombre(persona.getNombre());
		personaSelected.setApellidop(persona.getApellidop());
		personaSelected.setApellidom(persona.getApellidom());
		personaSelected.setEdad(persona.getEdad());
		
		personaUpdate = personaServiceImpl.actualizarPersona(personaSelected);
		
		return personaUpdate;
	}
	
	@DeleteMapping("/personas/{id}")
	public void eliminarPersona(@PathVariable(name = "id") Long id) {
		personaServiceImpl.eliminarPersona(id);
	}
	
	
}
