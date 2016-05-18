package com.marioaliaga.service.impl;

import com.marioaliaga.domain.Persona;
import com.marioaliaga.service.PersonaService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by maliaga on 17-05-16.
 */
@Component
public class PersonaServiceImpl implements PersonaService {

    @Override
    public Persona getPersona(Integer idPersona) {
        return new Persona(1, "Homero", "Simpson", "Direccion", "+5612345678", "email@host.com");
    }

    @Override
    public List<Persona> getPersonas() {
        return null;
    }
}
