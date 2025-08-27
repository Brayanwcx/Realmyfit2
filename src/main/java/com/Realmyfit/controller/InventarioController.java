package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventarios")
public class InventarioController {

	@GetMapping
	public String listarInventarios() {
		return "Lista de inventarios";

	}

	@PostMapping
	public String crearInventario() {
		return "Inventario creado";
	}
}
