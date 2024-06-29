package com.proyectoFinal.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "Coleccion")
public class Coleccion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idColeccion;
	@NotBlank(message="El nombre es obligatorio")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreColeccion", length =50, nullable=false)
	private String nombreColeccion;
	
	@Size(min=5,max=255,message="Debe de estar entre 5 y 255 caracteres")
	@Column(name="descripcionColeccion", length =255, nullable=false)
	private String descripcionColeccion;
	
	@Lob
    @Column(name = "imagenColeccion", nullable = true)
    private byte[] imagenColeccion;
	
	@JsonIgnoreProperties(value = {"idColeccion","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idColeccion", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Videojuego> videojuegos;
	
	@ManyToOne
	@JoinColumn(name= "idBlog")
	@JsonBackReference
	private Blog idBlog;

	public Long getIdColeccion() {
		return idColeccion;
	}

	public void setIdColeccion(Long idColeccion) {
		this.idColeccion = idColeccion;
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public String getDescripcionColeccion() {
		return descripcionColeccion;
	}

	public void setDescripcionColeccion(String descripcionColeccion) {
		this.descripcionColeccion = descripcionColeccion;
	}

	public byte[] getImagenColeccion() {
		return imagenColeccion;
	}

	public void setImagenColeccion(byte[] imagenColeccion) {
		this.imagenColeccion = imagenColeccion;
	}

	public List<Videojuego> getVideojuegos() {
		return videojuegos;
	}

	public void setVideojuegos(List<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
		for(Videojuego lista_videojuegos: videojuegos) {
			lista_videojuegos.setIdVideojuego(null);
		}
	}

	public Blog getIdBlog() {
		return idBlog;
	}

	public void setIdBlog(Blog idBlog) {
		this.idBlog = idBlog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Coleccion(Long idColeccion,
			@NotBlank(message = "El nombre es obligatorio") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreColeccion,
			@Size(min = 5, max = 255, message = "Debe de estar entre 5 y 255 caracteres") String descripcionColeccion,
			byte[] imagenColeccion, List<Videojuego> videojuegos, Blog idBlog) {
		super();
		this.idColeccion = idColeccion;
		this.nombreColeccion = nombreColeccion;
		this.descripcionColeccion = descripcionColeccion;
		this.imagenColeccion = imagenColeccion;
		this.videojuegos = videojuegos;
		this.idBlog = idBlog;
	}

	public Coleccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
