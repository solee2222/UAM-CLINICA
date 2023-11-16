package com.uam.CLINICA.model;

import lombok.*;
import org.openxava.annotations.Files;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Embeddable @Getter @Setter
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY genera automáticamente el ID
    @Column(name = "identificador", updatable = false, nullable = false)
    String identificador;

    @Column(length = 50)
    @Required
    String nombreSintoma;

    @Files
    @Column(length = 20) //fotos de sintomas opcional (ej: ronchas)
    String fotos;

    @Column(length = 50)
    @Required
    String medicamento;

    @Column(length = 50)
    @Required
    String cantidad;

    @Column(length = 50)
    @Required
    String diagnostico;
}