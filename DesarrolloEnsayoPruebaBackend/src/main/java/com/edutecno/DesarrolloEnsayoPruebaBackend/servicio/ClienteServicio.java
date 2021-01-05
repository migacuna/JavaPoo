package com.edutecno.DesarrolloEnsayoPruebaBackend.servicio;

import java.util.List;

import com.edutecno.DesarrolloEnsayoPruebaBackend.modelo.Clientes;

public interface ClienteServicio {
	
	List<Clientes> findAll(); // Metodo GET, me traigo la lista completa 
	
	Clientes findById(String id); // Metodo GET, me traigo un Objeto Segun Id

	void insert(Clientes cliente);  //Metodo POST, insertamos un objeto cliente
	
	void update(Clientes cliente); //Metodo PUT, modifica el objeto cliente
	
	void delete(Clientes cliente); //Metodo DELETE, eliminanos un Objeto cliente 
	
}
