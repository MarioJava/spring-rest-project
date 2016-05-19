package com.marioaliaga;

import com.marioaliaga.domain.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaServiceDummy {

    public Persona getOnePersona(){
        return new Persona(1, "Homero", "Simpson", "Direccion", "+5612345678", "email@host.com");
    }

    public List<Persona> getListPersona(){

        List<Persona> personaList = new ArrayList<Persona>(0);

        personaList.add(new Persona(1, "Homero", "Simpson", "Direccion", "+5612345678", "email@host.com"));
        personaList.add(new Persona(2, "Homero 1", "Simpson", "Direccion", "+5612345678", "email@host.com"));
        personaList.add(new Persona(3, "Homero 2", "Simpson", "Direccion", "+5612345678", "email@host.com"));
        personaList.add(new Persona(4, "Homero 3", "Simpson", "Direccion", "+5612345678", "email@host.com"));
        personaList.add(new Persona(5, "Homero 4", "Simpson", "Direccion", "+5612345678", "email@host.com"));
        personaList.add(new Persona(6, "Homero 5", "Simpson", "Direccion", "+5612345678", "email@host.com"));

        return personaList;
    }
}
