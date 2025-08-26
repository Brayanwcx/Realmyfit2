package com.Realmyfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalle;
	private Integer cantidad;
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;
//Getters y Setters

}
