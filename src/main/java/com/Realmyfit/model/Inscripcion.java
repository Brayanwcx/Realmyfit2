package com.Realmyfit.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inscripcion")
public class Inscripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInscripcion;
	private LocalDate fecha;
// Relacion con Usuario
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

// Relacion con Servicio
	@ManyToOne
	@JoinColumn(name = "id_servicio")
	private Servicio servicio;
}
