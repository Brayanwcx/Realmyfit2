package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class InscripcionEventoController {

	
	@GetMapping
	public String listarInscripciones() {
		return "lista de inscripciones a eventos";
	}
	@PostMapping
	public String crearInscripcion() {
		return "Inscripcion creada";
	}
}
