package com.cibertec.demo.controler;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.demo.Modelo.Empleado;
import com.cibertec.demo.interfacesService.InterfaceEmpleadoService;

import ch.qos.logback.core.model.Model;


@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private InterfaceEmpleadoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleados=service.listar();
	//	model.addAttribute("empleados", empleados);
		return "index";
	}
	@GetMapping("/new")
	public String agrega(Model model) {
		//model.addAttribute("empleado", new Empleado());
		return "form";
		
	}
	
	public String save (@Validated Empleado E, Model model) {
		service.save(E);
		return"redirect:/listar";
	}
	
	@PostMapping ("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		return "form";
		
	}

}
