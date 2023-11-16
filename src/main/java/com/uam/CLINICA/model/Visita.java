package com.uam.CLINICA.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;
import org.hibernate.annotations.GenericGenerator;

import lombok.*;

@Entity @Getter @Setter
public class Visita {

	@Id
	@Hidden // La propiedad no se muestra al usuario. Es un identificador interno
	@GeneratedValue(generator="system-uuid") // Identificador Universal Único (1)
	@GenericGenerator(name="system-uuid", strategy = "uuid")

	@Column(length=32)
	String oid; //identificador por cada ingreso de visita

	LocalDate date; //fecha

	@StringTime  @Required
	String horadeEntrada;

	@StringTime  @Required
	String horadeSalida;

	@Column(length=10) @Required //cif y sino cedula
	String cif;

	@Column(length=50) @Required
	String nombrePaciente;

	@Column(length=70) @Required
	String carrera;

	@Embedded
	Receta receta;
}
