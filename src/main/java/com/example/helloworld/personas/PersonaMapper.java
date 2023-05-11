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
	public Persona get(int id) {
		return new Persona(id, "hola", "adios", "ok", 1.3f, false);
	}
	public int insert(Persona persona) {
		return 0;
	}
	
	public int update(Persona persona) {
		return 0;
	}
	
	public int delete(int id) {
		return 0;
	}
}
