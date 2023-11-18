package com.uam.CLINICA.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import javax.persistence.*;

@Entity @Getter @Setter
public class Proveedor extends Identificable{

    @Column(length = 20)
    @Required
    String nombreProveedor;

    @Column(length = 20)
    @Required
    String compania;

    @Column(length = 20)
    String correo; //y si tiene mas de un correo... habria que hacer otra clase


}
