package dsw.projeto_rest.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dsw.projeto_rest.jpa.PostagemRepository;
import dsw.projeto_rest.jpa.UserRepository;
import dsw.projeto_rest.postagem.Postagem;
import jakarta.validation.Valid;

@RestController
public class UsuarioResource {
	
	private UserRepository userRepository;
	private PostagemRepository postagemRepository;

	public UsuarioResource(UserRepository userRepository, PostagemRepository postagemRepository) {
		super();
		this.userRepository = userRepository;
		this.postagemRepository = postagemRepository;
	}

	@GetMapping("/users")
	public List<User> listarUsuarios() {
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user ) {
		User savedUser = userRepository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping("/users/{id}/posts")
	public List<Postagem> listarPostagensDeUsuario(@PathVariable int id) {
		Optional<User> usuario = userRepository.findById(id);
		return usuario.get().getPostagens();
	}
	
	@PostMapping("/users/{id}/posts")
	public ResponseEntity<Object> criarPostagensDeUsuario (@PathVariable int id, @Valid @RequestBody Postagem postagem) {
		Optional<User> usuario = userRepository.findById(id);
		postagem.setUser(usuario.get());
		Postagem postagemSalva = postagemRepository.save(postagem);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(postagemSalva.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	
	

}
