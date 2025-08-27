package com.sena.Realmyfit.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "reseñas")
public class Reseña {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idreseña;

    private String comentario;
    private Integer calificacion;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    

	public Reseña(Integer idreseña, String comentario, Integer calificacion, LocalDateTime fecha, Usuario usuario) {
	
		this.idreseña = idreseña;
		this.comentario = comentario;
		this.calificacion = calificacion;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public Reseña() {}

    // Getters y Setters
	public Integer getIdreseña() {
		return idreseña;
	}

	public void setIdreseña(Integer idreseña) {
		this.idreseña = idreseña;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}





    
  

    @Override
    public String toString() {
        return "Reseña{" +
                "idreseña=" + idreseña +
                ", comentario='" + comentario + '\'' +
                ", calificacion=" + calificacion +
                ", fecha=" + fecha +
                '}';
    }
}
	