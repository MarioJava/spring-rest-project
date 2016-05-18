package com.marioaliaga.rest.controller;

import com.marioaliaga.domain.Persona;
import com.marioaliaga.service.PersonaService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by maliaga on 17-05-16.
 */
@RestController
public class PersonaController {

    @Autowired
    @Setter
    private PersonaService personaService;

    @RequestMapping("/personas/{id}")
    public HttpEntity<Persona> persona(
            @PathVariable int id) {

        Persona persona = personaService.getPersona(id);

        persona.add(linkTo(methodOn(PersonaController.class).persona(id)).withSelfRel());

        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }
}
