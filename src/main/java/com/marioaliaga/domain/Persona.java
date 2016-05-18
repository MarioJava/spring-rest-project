package com.marioaliaga.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by maliaga on 17-05-16.
 */

@Setter
@Getter
public class Persona extends ResourceSupport {

    @JsonCreator
    public Persona(@JsonProperty("idPersona") Integer idPersona,
                   @JsonProperty("nombre") String nombre,
                   @JsonProperty("apellido") String apellido,
                   @JsonProperty("direccion") String direccion,
                   @JsonProperty("telefono") String telefono,
                   @JsonProperty("email") String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
}
