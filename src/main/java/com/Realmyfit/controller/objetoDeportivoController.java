package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetos-deportivos")
public class objetoDeportivoController {

	@GetMapping
	public String listarObjetos() {
		return "Listar de objetos deportivos";
	}
	@PostMapping
	public String crearObjeto() {
		return "Objeto deportivo creado";
	}
}
