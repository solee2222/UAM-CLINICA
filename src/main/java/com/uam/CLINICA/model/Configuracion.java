package com.uam.CLINICA.model;

import lombok.*;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity @Getter @Setter //se almacenan los doctores que operan la clinica
public class Configuracion {

    @Id
    @Column(length = 20)
    String identificacion; //cedula

    @Column(length = 20)
    @Required
    String primerNombre;

    @Column(length = 20)
    @Required
    String primerApellido;
}
