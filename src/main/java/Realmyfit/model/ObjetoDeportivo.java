package Realmyfit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "objetos_deportivos")
public class ObjetoDeportivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_objetos_deportivos;

    private String nombre_objeto;
    private Integer numero_objeto;

    @ManyToOne
    @JoinColumn(name = "id_inventario")
    private Inventario inventario;

    public ObjetoDeportivo() {}

    public ObjetoDeportivo(Integer id_objetos_deportivos, String nombre_objeto, Integer numero_objeto) {
        this.id_objetos_deportivos = id_objetos_deportivos;
        this.nombre_objeto = nombre_objeto;
        this.numero_objeto = numero_objeto;
    }

    // Getters y Setters
    
    public Integer getId_objetos_deportivos() {
		return id_objetos_deportivos;
	}

	public void setId_objetos_deportivos(Integer id_objetos_deportivos) {
		this.id_objetos_deportivos = id_objetos_deportivos;
	}

	public String getNombre_objeto() {
		return nombre_objeto;
	}

	public void setNombre_objeto(String nombre_objeto) {
		this.nombre_objeto = nombre_objeto;
	}

	public Integer getNumero_objeto() {
		return numero_objeto;
	}

	public void setNumero_objeto(Integer numero_objeto) {
		this.numero_objeto = numero_objeto;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
   

    @Override
    public String toString() {
        return "ObjetoDeportivo [id_objetos_deportivos=" + id_objetos_deportivos +
               ", nombre_objeto=" + nombre_objeto +
               ", numero_objeto=" + numero_objeto + "]";
    }

	
}