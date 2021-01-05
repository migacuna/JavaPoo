package com.edutecno.DesarrolloEnsayoPruebaBackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.DesarrolloEnsayoPruebaBackend.modelo.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, String>{
		
	Clientes findByNombreCompania(String nombreCompania);
	Clientes findByNombreCompaniaAndNombreContacto(String nombreCompania, String nombreContacto);
	Clientes findByNombreCompaniaOrCodigoPostal(String nombreCompania, String codigoPostal);
}
