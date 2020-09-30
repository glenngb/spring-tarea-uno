package com.atarraya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
	
	@ManyToOne  
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey  = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;
	
	@Size(min = 3, message = "Nombre debe tener minimo 3 caracteres")
	@Column(name = "nombre", nullable = false, length = 70)
	private String nombre;
	
	
	@Size(min = 5, message = "La dirección debe tener minimo 5 caracteres")
	@Column(name = "dir_vendedor", nullable = false, length = 150)
	private String dirVendedor;


	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}


	public Supervisor getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDirVendedor() {
		return dirVendedor;
	}


	public void setDirVendedor(String dirVendedor) {
		this.dirVendedor = dirVendedor;
	}
}
