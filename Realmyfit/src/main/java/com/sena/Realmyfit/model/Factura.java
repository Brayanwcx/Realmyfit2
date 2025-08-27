package com.sena.Realmyfit.model;



import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_factura;

    private Date fecha_factura;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "factura")
    private List<Pagos> pagos;

    @OneToMany(mappedBy = "factura")
    private List<Membresia> membresias;

    public Factura() {}

    public Factura(Integer id_factura, Date fecha_factura, Double total) {
        this.id_factura = id_factura;
        this.fecha_factura = fecha_factura;
        this.total = total;
    }

    // Getters y Setters
	public Integer getId_factura() {
		return id_factura;
	}

	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pagos> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}

	public List<Membresia> getMembresias() {
		return membresias;
	}

	public void setMembresias(List<Membresia> membresias) {
		this.membresias = membresias;
	}

    @Override
    public String toString() {
        return "Factura [id_factura=" + id_factura +
               ", fecha_factura=" + fecha_factura +
               ", total=" + total + "]";
    }


}
