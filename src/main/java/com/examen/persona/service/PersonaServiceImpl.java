package com.examen.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.persona.dao.IPersonaDAO;
import com.examen.persona.dto.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	IPersonaDAO iPersonaDao;

	@Override
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return iPersonaDao.findAll();
	}

	@Override
	public Persona guardarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return iPersonaDao.save(persona);
	}


	@Override
	public Persona personaXID(Long id) {
		// TODO Auto-generated method stub
		return iPersonaDao.findById(id).get();
	}


	@Override
	public Persona actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return iPersonaDao.save(persona);
	}

	@Override
	public void eliminarPersona(Long id) {
		// TODO Auto-generated method stub
		iPersonaDao.deleteById(id);
	}


}
