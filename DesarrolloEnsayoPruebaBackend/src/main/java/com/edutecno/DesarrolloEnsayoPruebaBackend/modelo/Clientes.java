package com.edutecno.DesarrolloEnsayoPruebaBackend.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Clientes {
	
	@Id
	private String idCliente;
	private String nombreCompania;
	private String nombreContacto;
	private String tituloContacto;
	private String direccion;
	private String ciudad;
	private String region;
	private String codigoPostal;
	private String pais;
	private String telefono;
	private String mail;
	private String clave;

}
