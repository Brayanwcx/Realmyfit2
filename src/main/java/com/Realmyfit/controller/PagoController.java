package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagos")
public class PagoController {
	@GetMapping
	public String listarpagos() {
		return "Listar de pagos";
	}
	
	@PostMapping
	public String crearPago() {
		return "pago creado";
	}

}
