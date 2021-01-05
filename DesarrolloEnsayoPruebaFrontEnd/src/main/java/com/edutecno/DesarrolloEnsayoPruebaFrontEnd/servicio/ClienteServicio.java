package com.edutecno.DesarrolloEnsayoPruebaFrontEnd.servicio;

import java.util.List;

import com.edutecno.DesarrolloEnsayoPruebaFrontEnd.modelo.ClienteDto;

public interface ClienteServicio {
	
	List<ClienteDto> findAll(); // Metodo GET, me traigo la lista completa 
	
	ClienteDto findById(String id); // Metodo GET, me traigo un Objeto Segun Id

	void insert(ClienteDto cliente);  //Metodo POST, insertamos un objeto cliente
	
	void update(ClienteDto cliente); //Metodo PUT, modifica el objeto cliente
	
	void delete(ClienteDto cliente); //Metodo DELETE, elimina el objeto cliente

}
