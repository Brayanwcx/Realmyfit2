package com.Realmyfit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	private String nombre;
	private String apellido;
	private String email;
	private String password;

	// Relacion con factura (un usuario puede tener varias facturas)
	@OneToMany(mappedBy = "usuario")
	private List<Factura> facturas;
	// Realcion con Inscripcion (un usuario puede estar inscrito a varios
	// servicios/eventos)
	@OneToMany(mappedBy = "usuario")
	private List<Inscripcion> inscripciones;
}
