package com.edutecno.DesarrolloEnsayoPruebaFrontEnd.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.DesarrolloEnsayoPruebaFrontEnd.servicio.ClienteServicio;

@Controller
@RequestMapping(value = "/lclientes")
public class ClienteControlador {
	
	@Autowired
	ClienteServicio clienteServicio;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listar(ModelMap modelo) {
		modelo.addAttribute("listaClientes", clienteServicio.findAll());
		return new ModelAndView("listaClientes");
	}

	
}
