package com.uam.CLINICA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.IDENTITY genera automáticamente el ID
    @Column(name = "identificador", updatable = false, nullable = false)
    String identificador;
}