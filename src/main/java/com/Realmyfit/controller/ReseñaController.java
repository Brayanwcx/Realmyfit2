package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ReseñaController {

	@GetMapping
	public String listarReseñas() {
		return "listar de reseñas";
	}

	@PostMapping
	public String crearReseñas() {
		return "Reseña creada";
	}
}
