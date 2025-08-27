package com.Realmyfit.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEvento;
private String nombre;
private String descripcion;
private LocalDate fecha;
//Relacion con reseñas
@OneToMany(mappedBy = "evento")
private java.util.List<Resena> resenas;
}
