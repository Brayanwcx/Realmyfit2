package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membresias")
public class MembresiaController {

	
	
	@GetMapping
	public String listaMembresias() {
		return "Lista de membresias";
		
	}
	
	@PostMapping
	public String crearMembresias() {
		return "Membresia creada";
	}
}
