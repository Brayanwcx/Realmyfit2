package com.sena.Realmyfit.model;



import jakarta.persistence.*;

@Entity
@Table(name = "inscripcion_evento")
public class InscripcionEvento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_inscripcion_evento;

    private Boolean asistencia;

    @ManyToOne
    @JoinColumn(name = "id_gimnasio")
    private Gimnasio gimnasio;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public InscripcionEvento() {}

    public InscripcionEvento(Integer id_inscripcion_evento, Boolean asistencia) {
        this.id_inscripcion_evento = id_inscripcion_evento;
        this.asistencia = asistencia;
    }

    // Getters y Setters
    
    public Integer getId_inscripcion_evento() {
		return id_inscripcion_evento;
	}

	public void setId_inscripcion_evento(Integer id_inscripcion_evento) {
		this.id_inscripcion_evento = id_inscripcion_evento;
	}

	public Boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Boolean asistencia) {
		this.asistencia = asistencia;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    @Override
    public String toString() {
        return "InscripcionEvento [id_inscripcion_evento=" + id_inscripcion_evento +
               ", asistencia=" + asistencia + "]";
    }

	
}
