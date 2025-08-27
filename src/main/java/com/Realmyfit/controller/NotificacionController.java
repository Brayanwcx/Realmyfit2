package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotificacionController {

	@GetMapping
	public String listarNotificaciones() {
		return "Lsitar de notificaciones";

	}

	@PostMapping
	public String crearNotificacion() {
		return "Notificacion creada";
	}

}
