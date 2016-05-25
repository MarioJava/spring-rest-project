package com.marioaliaga.rest.controller;

import com.marioaliaga.domain.Persona;
import com.marioaliaga.service.PersonaService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/personas/", method = RequestMethod.GET)
    public ResponseEntity<List<Resource>> personas() {

        List<Link> links = new ArrayList<Link>();

        List<Persona> personas = personaService.getPersonas();

        links.add(linkTo(methodOn(PersonaController.class).personas()).withSelfRel());
        List<Resource> resources = personasToResource(personas);

        return ResponseEntity.ok(resources);
    }

    @RequestMapping(value = "/personas/{id}", method = RequestMethod.GET)
    public HttpEntity<Persona> persona(
            @PathVariable Integer id) {

        Persona persona = personaService.getPersona(id);

        persona.add(linkTo(methodOn(PersonaController.class).persona(id)).withSelfRel());

        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }

    private List<Resource> personasToResource(List<Persona> personas) {

        List<Resource> resources = new ArrayList<Resource>(personas.size());

        for (Persona persona : personas) {
            Link selfLink = linkTo(methodOn(PersonaController.class).persona(persona.getIdPersona())).withSelfRel();
            resources.add(new Resource<Persona>(persona, selfLink));
        }

        return resources;
    }

}
