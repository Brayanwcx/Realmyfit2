package com.Realmyfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

	
	@GetMapping
	public String listarFacturas() {
		return "Listar de facturas";
	}
	@PostMapping
	public String crearFactura() {
		return "Factura creada";
	}
}
