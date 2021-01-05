package com.edutecno.DesarrolloEnsayoPruebaFrontEnd.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutecno.DesarrolloEnsayoPruebaFrontEnd.modelo.ClienteDto;

@Service
public class ClienteServicioImp implements ClienteServicio {

	@Autowired
	RestTemplate restTemplate;  //se utiliza RestTemplate para el comusumo de una ApiRest
	
	@Override
	public List<ClienteDto> findAll() {
		// TODO Auto-generated method stub
		ResponseEntity<List<ClienteDto>> response = restTemplate.exchange(
				"http://localhost:8080/api/v1/clientes",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<ClienteDto>>() {});
		return response.getBody();
	}

	@Override
	public ClienteDto findById(String id) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://localhost:8080/api/v1/clientes" + "/" + id, ClienteDto.class);
	}

	@Override
	public void insert(ClienteDto cliente) {
		// TODO Auto-generated method stub
		restTemplate.postForObject("http://localhost:8080/api/v1/clientes" + "/", cliente, String.class);
	}

	@Override
	public void update(ClienteDto cliente) {
		// TODO Auto-generated method stub
		restTemplate.put("http://localhost:8080/api/v1/clientes", cliente);
	}

	@Override
	public void delete(ClienteDto cliente) {
		// TODO Auto-generated method stub
		restTemplate.delete("http://localhost:8080/api/v1/clientes" + "/" + cliente.getIdCliente());
	}

}
