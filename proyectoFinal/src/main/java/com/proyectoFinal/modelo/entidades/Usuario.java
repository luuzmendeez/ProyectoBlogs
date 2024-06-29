package com.proyectoFinal.modelo.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name= "Usuario")


public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idUsuario;
	@NotBlank(message="El nombre es obligatoria")
	@Size(min=5,max=20,message="Debe de estar entre 5 y 20 caracteres")
	@Column(name="nombreUsuario", length =50, nullable=false)
		private String nombreUsuario;
	@NotBlank(message="El correo es obligatorio")
	@Size(min=5,max=50,message="Debe de estar entre 5 y 50 caracteres")
	@Column(name="correo", length =50, nullable=false)
		private String correo;
	@NotBlank(message="La contraseña es obligatorio")
	@Size(min=5,max=50,message="Debe de estar entre 5 y 50 caracteres")
	@Column(name="password", length =50, nullable=false)
		private String password;
	@Temporal(TemporalType.DATE)
	@Column(name = "edad" ,nullable=false)
		private Date edad;
	@JsonIgnoreProperties(value = {"idUsuario","hibernateLazyInitializer","handler"},
			allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idUsuario", cascade= CascadeType.ALL)
	//@JsonManagedReference
	private List<Blog> blogs;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(Long idUsuario,
			@NotBlank(message = "El nombre es obligatoria") @Size(min = 5, max = 20, message = "Debe de estar entre 5 y 20 caracteres") String nombreUsuario,
			@NotBlank(message = "El correo es obligatorio") @Size(min = 5, max = 50, message = "Debe de estar entre 5 y 50 caracteres") String correo,
			@NotBlank(message = "La contraseña es obligatorio") @Size(min = 5, max = 50, message = "Debe de estar entre 5 y 50 caracteres") String password,
			Date edad, List<Blog> blogs) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correo = correo;
		this.password = password;
		this.edad = edad;
		this.blogs = blogs;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getEdad() {
		return edad;
	}
	public void setEdad(Date edad) {
		this.edad = edad;
	}
	public List<Blog> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
		for(Blog lista_blogs: blogs) {
			lista_blogs.setIdUsuario(this);
		}
	}
	
	
	
}
