package com.marioaliaga.service;

import com.marioaliaga.domain.Persona;

import java.util.List;

/**
 * Created by maliaga on 17-05-16.
 */
public interface PersonaService {

    Persona getPersona(Integer id);

    List<Persona> getPersonas();
}
