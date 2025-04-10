package dsw.projeto_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {
	
	@GetMapping("/inicio")
	public String incio() {
		return "Olá, mundo!";
	}
}
