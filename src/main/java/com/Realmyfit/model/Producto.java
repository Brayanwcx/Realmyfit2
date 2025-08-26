package com.Realmyfit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Integer stock;

//Relacion con FacturaDetalle
	@OneToMany(mappedBy = "producto")
	private List<FacturaDetalle> detalles;

//Getters y Setters

}
