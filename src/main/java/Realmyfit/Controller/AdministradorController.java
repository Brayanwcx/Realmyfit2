package Realmyfit.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//decile a la clase que es de tipo controlador
@Controller
@RequestMapping("/administrador") //solicitud de paeo al directorio administrador
public class AdministradorController {

    private final Logger LOGGER = LoggerFactory.getLogger(AdministradorController.class);

	@Autowired
	private IProductoService productoservice;


@GetMapping("")
public String home(Model model) {
	List<Producto> productos= productoservice.FindAll();
	model.addAttribute("productos" ,productos);
	return "administrador/home";
}

}
