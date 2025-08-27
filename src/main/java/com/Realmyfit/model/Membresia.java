package com.Realmyfit.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "membresias")
public class Membresia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo; // Ej: Mensual, Trimestral, Anual
	private double precio; // Precio de la membresía
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

	// 🔹 Constructor vacío
	public Membresia() {
	}

	// 🔹 Constructor con parámetros
	public Membresia(Long id, String tipo, double precio, LocalDate fechaInicio, LocalDate fechaFin) {
		this.id = id;
		this.tipo = tipo;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	// 🔹 Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	// 🔹 toString (opcional)
	@Override
	public String toString() {
		return "Membresia{" + "id=" + id + ", tipo='" + tipo + '\'' + ", precio=" + precio + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + '}';
	}

}
