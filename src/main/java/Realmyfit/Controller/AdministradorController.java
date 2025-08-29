package com.Realmyfit.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Realmyfit.model.Producto;

@Controller
@RequestMapping
public class AdministradorController {
private final Logger lOGGER = LoggerFactory.getLogger(AdministradorController.class);

@Autowired
private IProductoService productoService;

@GetMapping("")
public String home(Model model) {
	List<Producto> productos = productoService.FindALL();
	model.addAttribute("productos", productos);
	return "administrador/home";
}
}
package Realmyfit.Controller;

public class AdministradorController {

}
