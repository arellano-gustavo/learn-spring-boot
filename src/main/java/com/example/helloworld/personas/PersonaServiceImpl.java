package com.example.helloworld.personas;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service(value = "primeraImplementacion")
public class PersonaServiceImpl implements PersonaService {
    private PersonaMapper personaMapper;
    
    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }
    @Override
    public List<Persona> getAll() {
        return personaMapper.getAll();
    }
}
