package com.sena.Realmyfit.model;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notificaciones")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_notificacion;

    private String mensaje;
    private Date fecha_envio;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Notificacion() {}

    public Notificacion(Integer id_notificacion, String mensaje, Date fecha_envio, String tipo) {
        this.id_notificacion = id_notificacion;
        this.mensaje = mensaje;
        this.fecha_envio = fecha_envio;
        this.tipo = tipo;
    }

    // Getters y Setters
  
    public Integer getId_notificacion() {
		return id_notificacion;
	}

	public void setId_notificacion(Integer id_notificacion) {
		this.id_notificacion = id_notificacion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha_envio() {
		return fecha_envio;
	}

	public void setFecha_envio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


    

    @Override
    public String toString() {
        return "Notificaciones [id_notificacion=" + id_notificacion +
               ", mensaje=" + mensaje +
               ", fecha_envio=" + fecha_envio +
               ", tipo=" + tipo + "]";
    }

}