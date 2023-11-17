package com.uam.CLINICA.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import javax.persistence.*;

@Entity @Getter @Setter
public class Proveedor {
    @Id
    @Hidden // La propiedad no se muestra al usuario. Es un identificador interno
    @GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length = 20)
    String idProveedor;

    @Column(length = 20)
    @Required
    String nombreProveedor;

    @Column(length = 20)
    @Required
    String compania;

    @Column(length = 20)
    String correo;


}
