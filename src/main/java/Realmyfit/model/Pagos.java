package Realmyfit.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pagos;

    private Date fecha_pagos;

    @Enumerated(EnumType.STRING)
    private MedioPago medio_pago;

    private String historial_pagos;
    private Double monto_pago;

    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Pagos() {}

    public Pagos(Integer id_pagos, Date fecha_pagos, MedioPago medio_pago,
                 String historial_pagos, Double monto_pago) {
        this.id_pagos = id_pagos;
        this.fecha_pagos = fecha_pagos;
        this.medio_pago = medio_pago;
        this.historial_pagos = historial_pagos;
        this.monto_pago = monto_pago;
    }

    // Getters y Setters
    
    public Integer getId_pagos() {
		return id_pagos;
	}

	public void setId_pagos(Integer id_pagos) {
		this.id_pagos = id_pagos;
	}

	public Date getFecha_pagos() {
		return fecha_pagos;
	}

	public void setFecha_pagos(Date fecha_pagos) {
		this.fecha_pagos = fecha_pagos;
	}

	public MedioPago getMedio_pago() {
		return medio_pago;
	}

	public void setMedio_pago(MedioPago medio_pago) {
		this.medio_pago = medio_pago;
	}

	public String getHistorial_pagos() {
		return historial_pagos;
	}

	public void setHistorial_pagos(String historial_pagos) {
		this.historial_pagos = historial_pagos;
	}

	public Double getMonto_pago() {
		return monto_pago;
	}

	public void setMonto_pago(Double monto_pago) {
		this.monto_pago = monto_pago;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    @Override
    public String toString() {
        return "Pagos [id_pagos=" + id_pagos +
               ", fecha_pagos=" + fecha_pagos +
               ", medio_pago=" + medio_pago +
               ", historial_pagos=" + historial_pagos +
               ", monto_pago=" + monto_pago + "]";
    }

   

	// Enum para medios de pago
    public enum MedioPago {
        EFECTIVO,
        TARJETA,
        TRANSFERENCIA
    }
}