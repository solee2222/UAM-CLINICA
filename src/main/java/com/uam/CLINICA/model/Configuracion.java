package com.uam.CLINICA.model;

import lombok.*;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity //se almacenan los doctores que operan la clinica
@Getter @Setter
public class Configuracion {

    @Id
    @Column(length = 20)
    String identificacion;

    @Column(length = 20)
    @Required
    String primerNombre;

    @Column(length = 20)
    @Required
    String primerApellido;
}