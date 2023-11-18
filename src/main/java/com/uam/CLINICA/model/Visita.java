package com.uam.CLINICA.model;

import java.time.*;
import java.util.Collection;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.model.*;
import org.hibernate.annotations.GenericGenerator;

import lombok.*;

@Entity @Getter @Setter
public class Visita extends Identificable{

	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class) // Fecha actual
	private LocalDate date; //fecha

	@StringTime  @Required
	//@DefaultValueCalculator(CurrentLocalTimeCalculator.class)
	private String horadeEntrada;

	@StringTime  @Required
	private String horadeSalida;

	@Column(length=10) @Required //cif y sino cedula
	private String cif;

	@Required
	private String nombrePaciente;

	private String carrera;

	@Embedded
	Receta receta;

}
