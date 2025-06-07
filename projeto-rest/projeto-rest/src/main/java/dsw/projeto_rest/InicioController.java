package dsw.projeto_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {
	
	@GetMapping("/inicio")
	public String inicio(@RequestParam(value="nome", defaultValue="world") String nome) {
		return String.format("HELLO, %s!", nome);
	}
	
	@GetMapping("/bean")
	public PrimeiroBean bean() {
		return new PrimeiroBean();
	}

	//Tarefas App
}
