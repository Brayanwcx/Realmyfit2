package Realmyfit.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "membresias")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_membresias;

    private String tipo_membresias;
    private Date fecha_inicio;
    private Date fecha_final;
    private Double precio;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_pagos")
    private Pagos pagos;

    @ManyToOne
    @JoinColumn(name = "id_gimnasio")
    private Gimnasio gimnasio;

    public Membresia() {}

    public Membresia(Integer id_membresias, String tipo_membresias, Date fecha_inicio, Date fecha_final,
                      Double precio, String descripcion) {
        this.id_membresias = id_membresias;
        this.tipo_membresias = tipo_membresias;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y Setters
 
    @Override
    public String toString() {
        return "Membresias [id_membresias=" + id_membresias +
               ", tipo_membresias=" + tipo_membresias +
               ", fecha_inicio=" + fecha_inicio +
               ", fecha_final=" + fecha_final +
               ", precio=" + precio +
               ", descripcion=" + descripcion + "]";
    }

	public Integer getId_membresias() {
		return id_membresias;
	}

	public void setId_membresias(Integer id_membresias) {
		this.id_membresias = id_membresias;
	}

	public String getTipo_membresias() {
		return tipo_membresias;
	}

	public void setTipo_membresias(String tipo_membresias) {
		this.tipo_membresias = tipo_membresias;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public Pagos getPagos() {
		return pagos;
	}

	public void setPagos(Pagos pagos) {
		this.pagos = pagos;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}
}