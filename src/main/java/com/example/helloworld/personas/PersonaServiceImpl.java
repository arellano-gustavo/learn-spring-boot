package com.example.helloworld.personas;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    
    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }
    @Override
    public List<Persona> getAll() {
        return personaMapper.getAll();
    }
	@Override
	public Persona get(int id) {
		return personaMapper.get(id);
	}
	@Override
	public int insert(Persona persona) {
		return personaMapper.insert(persona);
	}
	@Override
	public int update(Persona persona) {
		return personaMapper.update(persona);
	}
	@Override
	public int delete(int id) {
		return personaMapper.delete(id);
	}
}

/*
las clases de implementacion de servicios generalmente contienen lógica de negocio compleja.
está lógica DEBE OBLIGATORIAMENTE ser probada en su totalidad con pruebas de unidad.


*/