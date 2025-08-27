package com.Realmyfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ejercicios")
public class Ejercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String descripcion;
	private String musculoObjetivo; //Ej: pecho,Espalda,Piernas

	// Constructor vacio 
	public Ejercicio() {
		
	}

//🔹 Getters y Setters
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

public String getMusculoObjetivo() {
    return musculoObjetivo;
}

public void setMusculoObjetivo(String musculoObjetivo) {
    this.musculoObjetivo = musculoObjetivo;
}

// 🔹 toString (opcional, útil para depuración)
@Override
public String toString() {
    return "Ejercicio{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", descripcion='" + descripcion + '\'' +
            ", musculoObjetivo='" + musculoObjetivo + '\'' +
            '}';
}
}
