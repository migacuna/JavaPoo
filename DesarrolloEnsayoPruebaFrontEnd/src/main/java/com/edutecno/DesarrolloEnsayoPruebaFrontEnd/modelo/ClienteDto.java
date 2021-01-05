package com.edutecno.DesarrolloEnsayoPruebaFrontEnd.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClienteDto {
	
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
