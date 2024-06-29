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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name= "Blog")
public class Blog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBlog;
	@NotBlank(message="El nombre es obligatorio")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreBlog", length =50, nullable=false)
	private String nombreBlog;
	
	@Size(min=5,max=255,message="Debe de estar entre 5 y 255 caracteres")
	@Column(name="descripcionBlog", length =255, nullable=false)
	private String descripcionBlog;
	
	@ManyToOne
	@JoinColumn(name= "idUsuario")
	@JsonBackReference
	private Usuario idUsuario;
	
	@JsonIgnoreProperties(value = {"idBlog","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idBlog", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Coleccion> colecciones;
	
	@JsonIgnoreProperties(value = {"idBlog","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idBlog", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Playlist> playlists;
	
	@JsonIgnoreProperties(value = {"idBlog","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idBlog", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Nota> notas;

	
	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blog(Long idBlog,
			@NotBlank(message = "El nombre es obligatorio") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreBlog,
			@Size(min = 5, max = 255, message = "Debe de estar entre 5 y 255 caracteres") String descripcionBlog,
			Usuario idUsuario, List<Coleccion> colecciones, List<Playlist> playlists, List<Nota> notas) {
		super();
		this.idBlog = idBlog;
		this.nombreBlog = nombreBlog;
		this.descripcionBlog = descripcionBlog;
		this.idUsuario = idUsuario;
		this.colecciones = colecciones;
		this.playlists = playlists;
		this.notas = notas;
	}

	public Long getIdBlog() {
		return idBlog;
	}

	public void setIdBlog(Long idBlog) {
		this.idBlog = idBlog;
	}

	public String getNombreBlog() {
		return nombreBlog;
	}

	public void setNombreBlog(String nombreBlog) {
		this.nombreBlog = nombreBlog;
	}

	public String getDescripcionBlog() {
		return descripcionBlog;
	}

	public void setDescripcionBlog(String descripcionBlog) {
		this.descripcionBlog = descripcionBlog;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public List<Coleccion> getColecciones() {
		return colecciones;
	}

	public void setColecciones(List<Coleccion> colecciones) {
		this.colecciones = colecciones;
		for(Coleccion lista_colecciones: colecciones) {
			lista_colecciones.setIdBlog(null);
		}
	}

	public List<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
		for(Playlist lista_playlists: playlists) {
			lista_playlists.setIdBlog(null);
		}
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
		for(Nota lista_notas: notas) {
			lista_notas.setIdBlog(null);
		}
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
