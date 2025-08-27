package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EventoController {

	
	@GetMapping
	public String listarEventos() {
		return "lista de eventos";
		
	}
	
	@PostMapping
	public String crearEvento( ) {
		return "Evento creado";
	}
}
