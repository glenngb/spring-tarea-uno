package com.atarraya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSupervisor;
	
	@Size(min = 3, message = "Nombre debe tener minimo 5 caracteres")
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	@Size(min = 5, message = "La dirección debe tener minimo 5 caracteres")
	@Column(name = "dir_supervisor", nullable = false, length = 80)
	private String dirSupervisor;
	
	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "tel_supervisor", nullable = false, length = 9)
	private String telSupervisor;

	public Integer getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(Integer idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirSupervisor() {
		return dirSupervisor;
	}

	public void setDirSupervisor(String dirSupervisor) {
		this.dirSupervisor = dirSupervisor;
	}

	public String getTelSupervisor() {
		return telSupervisor;
	}

	public void setTelSupervisor(String telSupervisor) {
		this.telSupervisor = telSupervisor;
	}

}
