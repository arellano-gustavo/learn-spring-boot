package com.example.helloworld.personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaMapper {
    private List<Persona> baseDeDatos = null;
    
    public PersonaMapper() {
        this.baseDeDatos = new ArrayList<>();
        baseDeDatos.add(new Persona(1100, "gus", "are", "san", 1.1f, true));
        baseDeDatos.add(new Persona(2100, "tavo", "fox", "foo", 1.2f, true));
    }
    
    public List<Persona> getAll(){
        return this.baseDeDatos;
    }
    public Persona get(int id) {
        Optional<Persona> encontrado = baseDeDatos.stream().filter(x -> x.getId()==id).findFirst();
        if(encontrado.isPresent()) return encontrado.get();
        return null;
    }
    public int insert(Persona persona) {
        Persona p = get(persona.getId());
        if(p==null) baseDeDatos.add(persona);
        return 0;
    }
    
    public int update(Persona persona) {
        Persona p = get(persona.getId());
        if(p!=null)  {
            baseDeDatos.remove(p);
            baseDeDatos.add(persona);
        }
        return 0;
    }
    
    public int delete(int id) {
        Persona p = get(id);
        if(p!=null) baseDeDatos.remove(p);
        return 0;
    }
}
