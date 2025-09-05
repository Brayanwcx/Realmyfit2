package Realmyfit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("mensaje", "Bienvenido Usuario");
		return "usuario/home";
	}
}
