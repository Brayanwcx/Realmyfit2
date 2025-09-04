package Realmyfit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_inventario;

    private String productos;

    @ManyToOne
    @JoinColumn(name = "id_gimnasio")
    private Gimnasio gimnasio;

    @OneToMany(mappedBy = "inventario")
    private List<ObjetoDeportivo> objetosDeportivos;

    public Inventario() {}

    public Inventario(Integer id_inventario, String productos) {
        this.id_inventario = id_inventario;
        this.productos = productos;
    }

    // Getters y Setters
    
    public Integer getId_inventario() {
		return id_inventario;
	}

	public void setId_inventario(Integer id_inventario) {
		this.id_inventario = id_inventario;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	public List<ObjetoDeportivo> getObjetosDeportivos() {
		return objetosDeportivos;
	}

	public void setObjetosDeportivos(List<ObjetoDeportivo> objetosDeportivos) {
		this.objetosDeportivos = objetosDeportivos;
	}

    @Override
    public String toString() {
        return "Inventario [id_inventario=" + id_inventario +
               ", productos=" + productos + "]";
    }

	
}