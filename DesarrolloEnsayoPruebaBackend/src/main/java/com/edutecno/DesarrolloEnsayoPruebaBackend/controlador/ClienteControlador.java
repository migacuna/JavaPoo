package com.edutecno.DesarrolloEnsayoPruebaBackend.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.DesarrolloEnsayoPruebaBackend.modelo.Clientes;
import com.edutecno.DesarrolloEnsayoPruebaBackend.servicio.ClienteServicio;

@RestController							// 
@RequestMapping("/api/v1/clientes")		// le entrego el nombre de la API a la URI
public class ClienteControlador {
	
	//Inyeccion de servicio
	@Autowired							// 
	ClienteServicio clienteServicio;	//El controlador llama al "servicio" y el "servicio llama a la "dao"
	
	//Exposiscion de metodos
	@GetMapping									//Para obtener la URI mediante la API
	@ResponseStatus(value = HttpStatus.OK)		//
	public List<Clientes> findAll(){
		return clienteServicio.findAll();
	}

	@GetMapping("/{id}")
	public Clientes finById(@PathVariable String id) {
		return clienteServicio.findById(id);
	}
	
	@PostMapping
	public void insert(@RequestBody Clientes cliente) {
		clienteServicio.insert(cliente);
	}
	
	@PutMapping
	public void update(@RequestBody Clientes cliente) {
		clienteServicio.update(cliente);
	}
	
	/*@DeleteMapping
	public void delete(@RequestBody Clientes cliente) {
		clienteServicio.delete(cliente);
	}*/
	
	@DeleteMapping("/{idCliente}")
    public void delete(@PathVariable String idCliente) {
        Clientes cliente = new Clientes();
        cliente.setIdCliente(idCliente);
        clienteServicio.delete(cliente);
    }
}
