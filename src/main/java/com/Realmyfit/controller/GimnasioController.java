package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/gimnasios")
public class GimnasioController {

	@GetMapping
	public String listarGimnasios() {
		return "Lista de gimnasios";
	}
	
	@PostMapping
	public String crearGimnasio() {
		return "Gimnasio creado";
	}
}
