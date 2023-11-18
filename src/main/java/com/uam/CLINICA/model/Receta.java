package com.uam.CLINICA.model;

import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import javax.persistence.*;

@Embeddable @Getter @Setter
public class Receta extends Identificable{ //de esta forma ò

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) que se muestre tipo receta 1, receta 2 etc... por pantalla pero no me funciona
    private Integer identificador;*/

    @Column(length = 50)
    @Required
    private String sintoma;

    @Column(length = 50)
    @Required
    private String medicamento;

    @Column(length = 50)
    @Required
    private String cantidad;

    @Column(length = 50)
    @Required
    private String diagnostico;

    @Files
    @Column(length = 20) //fotos de sintomas opcional (ej: ronchas)
    private String fotos;
}