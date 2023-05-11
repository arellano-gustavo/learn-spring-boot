package com.example.helloworld.personas;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class PersonaController {
    private PersonaService personaService;
    
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping(
            value= "/personas", 
            produces = "application/json; charset=utf-8")
    public List<Persona> personas() {
        return personaService.getAll();
    }
}
