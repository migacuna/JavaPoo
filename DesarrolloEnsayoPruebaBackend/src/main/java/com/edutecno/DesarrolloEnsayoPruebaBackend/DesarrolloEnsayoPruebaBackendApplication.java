package com.edutecno.DesarrolloEnsayoPruebaBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.edutecno.DesarrolloEnsayoPruebaBackend.dao.ClienteRepository;
import com.edutecno.DesarrolloEnsayoPruebaBackend.servicio.ClienteServicio;

@SpringBootApplication
public class DesarrolloEnsayoPruebaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesarrolloEnsayoPruebaBackendApplication.class, args);
		
		//Probamos los metodos del Repositorio hacia la base de datos.
		
		/*AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClienteRepository clienteDao = acac.getBean(ClienteRepository.class);
		System.out.println(clienteDao.findAll()); //muestra una lista de todos los clientes
		System.out.println(clienteDao.findByNombreCompania("Around the Horn")); //Busca un cliente especifico por nombre de compañia
		System.out.println(clienteDao.findByNombreCompaniaAndNombreContacto("Bon app'", "Laurence Lebihan")); //Busca el nombre de la compañia Y el nombre del contacto
		System.out.println(clienteDao.findByNombreCompaniaOrCodigoPostal("Bon app", "3012")); //busca el nombre de la compañia O el codigo postal */
		
		// Probamos el metodo findALL de la capa de servicio
		
		/*AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClienteServicio clienteServicio = acac.getBean(ClienteServicio.class);
		System.out.println(clienteServicio.findAll()); */
		
		// Probamos el metodo findById de la capa de servicio
		
		/*AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		ClienteServicio clienteServicio = acac.getBean(ClienteServicio.class);
		System.out.println(clienteServicio.findById("REGGC"));  // trae el objeto Entity con el ID="REGGC" */
	}

}
