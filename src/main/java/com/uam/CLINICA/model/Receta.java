package com.uam.CLINICA.model;

import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import javax.persistence.*;

@Embeddable @Getter @Setter
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificador;

    @Column(length = 50)
    @Required
    String sintoma;

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