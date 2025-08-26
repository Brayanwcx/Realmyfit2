package com.Realmyfit.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFactura;
	private LocalDate fecha;
	// Relacion con Usuario
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	// Relacion con FacturaDetalle
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
	private List<FacturaDetalle> detalles;

}
