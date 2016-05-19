package com.marioaliaga.service.impl;

import com.marioaliaga.PersonaServiceDummy;
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
        return new PersonaServiceDummy().getOnePersona();
    }

    @Override
    public List<Persona> getPersonas() {
        return new PersonaServiceDummy().getListPersona();
    }
}
