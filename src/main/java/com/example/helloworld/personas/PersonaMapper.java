package com.example.helloworld.personas;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaMapper {
    public List<Persona> getAll(){
        return List.of(
            new Persona(1, "gus", "are", "san", 1.1f, true), 
            new Persona(2, "tavo", "fox", "foo", 1.2f, true)
        );
    }
}
