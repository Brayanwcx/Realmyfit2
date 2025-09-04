package Realmyfit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idroles;

    private String nombre;

    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuarios;

    public Rol() {}

    public Rol(Integer idroles, String nombre) {
        this.idroles = idroles;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Integer getIdroles() {
		return idroles;
	}

	public void setIdroles(Integer idroles) {
		this.idroles = idroles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    @Override
    public String toString() {
        return "Rol [idroles=" + idroles + ", nombre=" + nombre + "]";
    }

	
	}