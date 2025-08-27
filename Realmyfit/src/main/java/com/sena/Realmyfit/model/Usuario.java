package com.sena.Realmyfit.model;



import java.util.Date;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String nombre;
    private String apellido;
    private String identificacion;

    private Date fecha_nacimiento;
    private String correo;
    private String celular;
    private String genero;
    private String ubicacion;
    private String contrasena;
    private String verificacion;

    @ManyToOne
    @JoinColumn(name = "idroles")
    private Rol rol;

    @OneToMany(mappedBy = "usuario")
    private List<Notificacion> notificaciones;

    @OneToMany(mappedBy = "usuario")
    private List<Factura> facturas;

    @OneToMany(mappedBy = "usuario")
    private List<Reseña> reseñas;

    @OneToMany(mappedBy = "usuario")
    private List<Membresia> membresias;

    @OneToMany(mappedBy = "usuario")
    private List<Pagos> pagos;

    @OneToMany(mappedBy = "usuario")
    private List<InscripcionEvento> inscripciones;

    @OneToMany(mappedBy = "usuario")
    private List<Gimnasio> gimnasios;

    public Usuario() {}

    public Usuario(Integer id_usuario, String nombre, String apellido, String identificacion, Date fecha_nacimiento,
                   String correo, String celular, String genero, String ubicacion, String contrasena, String verificacion) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.celular = celular;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.contrasena = contrasena;
        this.verificacion = verificacion;
    }

    // Getters y Setters
    public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getVerificacion() {
		return verificacion;
	}

	public void setVerificacion(String verificacion) {
		this.verificacion = verificacion;
	}

    @Override
    public String toString() {
        return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido +
               ", identificacion=" + identificacion + ", fecha_nacimiento=" + fecha_nacimiento +
               ", correo=" + correo + ", celular=" + celular + ", genero=" + genero +
               ", ubicacion=" + ubicacion + ", contrasena=" + contrasena +
               ", verificacion=" + verificacion + "]";
    }

	
}
