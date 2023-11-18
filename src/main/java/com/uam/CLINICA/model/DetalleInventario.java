package com.uam.CLINICA.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Inventario") //para que en la interfaz de usuario salga como Inventario
@Getter
@Setter
public class DetalleInventario extends Identificable{

    @Id
    @Column(length = 20)
    String idMed;

    @Column(length = 20)
    @Required
    Integer existencias;

    @Column(length = 20)
    @Required
    Integer numeroCompra;

    @Column(length = 20)
    @Required
    Integer minimoExistencia;

}
