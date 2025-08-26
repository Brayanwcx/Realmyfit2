package com.Realmyfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planes_entrenamiento")
public class PlanEntrenamiento {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombre;        // Nombre del plan (Ej: "Plan de fuerza", "Cardio intensivo")
	    private String descripcion;   // Breve descripción del plan
	    private int duracionSemanas;  // Duración del plan en semanas

	    // 🔹 Constructor vacío
	    public PlanEntrenamiento() {
	    }

	    // 🔹 Constructor con parámetros
	    public PlanEntrenamiento(Long id, String nombre, String descripcion, int duracionSemanas) {
	        this.id = id;
	        this.nombre = nombre;
	        this.descripcion = descripcion;
	        this.duracionSemanas = duracionSemanas;
	    }

	    // 🔹 Getters y Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    public int getDuracionSemanas() {
	        return duracionSemanas;
	    }

	    public void setDuracionSemanas(int duracionSemanas) {
	        this.duracionSemanas = duracionSemanas;
	    }

	    // 🔹 toString (opcional)
	    @Override
	    public String toString() {
	        return "PlanEntrenamiento{" +
	                "id=" + id +
	                ", nombre='" + nombre + '\'' +
	                ", descripcion='" + descripcion + '\'' +
	                ", duracionSemanas=" + duracionSemanas +
	                '}';
	    }
	}

