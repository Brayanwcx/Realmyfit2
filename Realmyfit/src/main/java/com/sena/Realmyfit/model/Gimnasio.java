package com.sena.Realmyfit.model;


import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "gimnasio")
public class Gimnasio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_gimnasio;

    private String nombre;
    private String direccion;
    private String telefono;
    private Date horario_apertura;
    private Date horario_cierre;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "gimnasio")
    private List<Inventario> inventario;

    @OneToMany(mappedBy = "gimnasio")
    private List<InscripcionEvento> inscripciones;

    @OneToMany(mappedBy = "gimnasio")
    private List<Membresia> membresias;

    @OneToMany(mappedBy = "gimnasio")
    private List<Evento> eventos;

    public Gimnasio() {}

    public Gimnasio(Integer id_gimnasio, String nombre, String direccion, String telefono,
                    Date horario_apertura, Date horario_cierre) {
        this.id_gimnasio = id_gimnasio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario_apertura = horario_apertura;
        this.horario_cierre = horario_cierre;
    }

    // Getters y Setters
	public Integer getId_gimnasio() {
		return id_gimnasio;
	}

	public void setId_gimnasio(Integer id_gimnasio) {
		this.id_gimnasio = id_gimnasio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getHorario_apertura() {
		return horario_apertura;
	}

	public void setHorario_apertura(Date horario_apertura) {
		this.horario_apertura = horario_apertura;
	}

	public Date getHorario_cierre() {
		return horario_cierre;
	}

	public void setHorario_cierre(Date horario_cierre) {
		this.horario_cierre = horario_cierre;
	}

    @Override
    public String toString() {
        return "Gimnasio [id_gimnasio=" + id_gimnasio + ", nombre=" + nombre +
               ", direccion=" + direccion + ", telefono=" + telefono +
               ", horario_apertura=" + horario_apertura + ", horario_cierre=" + horario_cierre + "]";
    }


}



