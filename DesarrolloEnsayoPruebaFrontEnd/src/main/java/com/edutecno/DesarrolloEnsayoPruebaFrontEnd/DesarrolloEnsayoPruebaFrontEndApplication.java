package com.edutecno.DesarrolloEnsayoPruebaFrontEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edutecno.DesarrolloEnsayoPruebaFrontEnd.modelo.ClienteDto;
import com.edutecno.DesarrolloEnsayoPruebaFrontEnd.servicio.ClienteServicio;

@SpringBootApplication
public class DesarrolloEnsayoPruebaFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesarrolloEnsayoPruebaFrontEndApplication.class, args);
		
		//Probando metodo findAll)
		/*AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClienteServicio clienteServicio = acac.getBean(ClienteServicio.class);
		System.out.println(clienteServicio.findAll());*/
		
		//Probando metodo insertll)
		/*AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClienteServicio clienteServicio = acac.getBean(ClienteServicio.class);
		ClienteDto clienteDto = new ClienteDto();
		clienteDto.setIdCliente("BBBBB");
		clienteDto.setNombreCompania("dsfsdfsdfdsf");
		clienteServicio.insert(clienteDto);*/		
	}

}
