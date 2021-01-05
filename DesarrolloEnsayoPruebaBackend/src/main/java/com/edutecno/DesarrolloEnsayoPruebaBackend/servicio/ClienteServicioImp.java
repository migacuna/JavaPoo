package com.edutecno.DesarrolloEnsayoPruebaBackend.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.DesarrolloEnsayoPruebaBackend.dao.ClienteRepository;
import com.edutecno.DesarrolloEnsayoPruebaBackend.modelo.Clientes;

@Service
public class ClienteServicioImp implements ClienteServicio{
		
	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll(); 	//retorna la lista completa de la Entity del metodo findALL
	}

	@Override
	public Clientes findById(String id) {
		// TODO Auto-generated method stub
		//return clienteRepository.findById(id).get();                 // .get() retorna un objeto cliente que esta en optional del medoto findById
		return clienteRepository.findById(id).orElse(new Clientes());  // .oRElse() retorna el objeto si viene vacio de la dao, lo crea un cliente vacio
	}

	@Override
	public void insert(Clientes cliente) {
		// TODO Auto-generated method stub
		clienteRepository.save(cliente);	 	 // .save() crea un Objeto entity de la clase cliente
	}

	@Override
	public void update(Clientes cliente) {
		// TODO Auto-generated method stub
		clienteRepository.save(cliente);		// .save() identifica si se replica el Id, lo actualiza, sino lo Inserta
	}

	@Override
	public void delete(Clientes cliente) {
		// TODO Auto-generated method stub
		clienteRepository.delete(cliente); 		// .delete() Identifica el Objeto de la Entity y lo elimina
	}
	
	

}
