package com.Realmyfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resena")
public class Resena {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idResena;
private String comentario;
private Integer calificacion;

@ManyToOne
@JoinColumn(name = "id_evento")
private Evento evento;


}
