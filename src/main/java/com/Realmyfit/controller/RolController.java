package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ RestController
@RequestMapping("/roles")
public class RolController {

	@GetMapping
	public String listarRoles() {
		return "listar de roles";
	}
	
	@PostMapping
	public String crearRol() {
		return "Rol creado";
	}
}
