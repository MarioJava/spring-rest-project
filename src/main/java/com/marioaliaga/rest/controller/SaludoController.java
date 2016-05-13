package com.marioaliaga.rest.controller;

/**
 * Created by maliaga on 12-05-16.
 */
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SaludoController {

    private static final String TEMPLATE = "Hola, %s!";

    @RequestMapping("/saludar")
    public HttpEntity<Saludo> saludar(
            @RequestParam(value = "name", required = false, defaultValue = "Mundo") String name) {

        Saludo saludar = new Saludo(String.format(TEMPLATE, name));
        saludar.add(linkTo(methodOn(SaludoController.class).saludar(name)).withSelfRel());

        return new ResponseEntity<Saludo>(saludar, HttpStatus.OK);
    }
}
