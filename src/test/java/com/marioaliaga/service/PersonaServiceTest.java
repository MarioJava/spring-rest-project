package com.marioaliaga.service;

import com.marioaliaga.SpringRestApplication;
import com.marioaliaga.domain.Persona;
import lombok.Setter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRestApplication.class)
@WebAppConfiguration
public class PersonaServiceTest {

    @Autowired
    @Setter
    private PersonaService personaService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void deberiaObtenerUnObjetoPersonaNotNull(){
        System.out.println("Ejecutando deberiaObtenerUnObjetoPersonaNotNull ");
        Persona persona = personaService.getPersona(new Integer(1));
        System.out.println(" persona : " + persona.toString());
        assertNotNull(persona);
    }

}
