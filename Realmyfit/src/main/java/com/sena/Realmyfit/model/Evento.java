package com.sena.Realmyfit.model;



import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_eventos;

    private String titulo;
    private String descripcion;
    private Date fecha;
    private Integer capacidad;
    
    
    @OneToMany(mappedBy = "evento")
    private List<Reseña> reseñas;


    public List<Reseña> getReseñas() {
		return reseñas;
	}

	public void setReseñas(List<Reseña> reseñas) {
		this.reseñas = reseñas;
	}

	@ManyToOne
    @JoinColumn(name = "id_inscripcion_evento")
    private InscripcionEvento inscripcionEvento;

    @ManyToOne
    @JoinColumn(name = "id_gimnasio")
    private Gimnasio gimnasio;

    public Evento() {}

    public Evento(Integer id_eventos, String titulo, String descripcion, Date fecha, Integer capacidad) {
        this.id_eventos = id_eventos;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.capacidad = capacidad;
    }

  
	// Getters y Setters
    public Integer getId_eventos() {
		return id_eventos;
	}

	public void setId_eventos(Integer id_eventos) {
		this.id_eventos = id_eventos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public InscripcionEvento getInscripcionEvento() {
		return inscripcionEvento;
	}

	public void setInscripcionEvento(InscripcionEvento inscripcionEvento) {
		this.inscripcionEvento = inscripcionEvento;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
		
	}
	public List<Reseña> getReseña() {
		return reseñas;
	}
	
	
    @Override
    public String toString() {
        return "Eventos [id_eventos=" + id_eventos +
               ", titulo=" + titulo +
               ", descripcion=" + descripcion +
               ", fecha=" + fecha +
               ", capacidad=" + capacidad + "]";
    }

	
}
