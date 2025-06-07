package dsw.projeto_rest.user;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import dsw.projeto_rest.jpa.TarefaRepository;
import dsw.projeto_rest.tarefa.Tarefa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dsw.projeto_rest.jpa.PostagemRepository;
import dsw.projeto_rest.jpa.UserRepository;
import dsw.projeto_rest.postagem.Postagem;
import jakarta.validation.Valid;

@RestController
public class UsuarioResource {
	
	private UserRepository userRepository;
	private PostagemRepository postagemRepository;
	private TarefaRepository tarefaRepository;

	public UsuarioResource(UserRepository userRepository, PostagemRepository postagemRepository, TarefaRepository tarefaRepository) {
		super();
		this.userRepository = userRepository;
		this.postagemRepository = postagemRepository;
		this.tarefaRepository = tarefaRepository;
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
	
	
	@PostMapping("users/{username}/tarefas")
	public ResponseEntity<Object> criarTarefaDeUsuario(
			@PathVariable String username, @Valid @RequestBody Tarefa tarefa
	) {
		Optional<User> usuario = userRepository.findByUsuario(username);

		tarefa.setUsuario(usuario.get());
		Tarefa tarefaSalva = tarefaRepository.save(tarefa);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(tarefaSalva.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

	@GetMapping("users/{username}/tarefas")
	public List<Tarefa> listarTarefasDeUsuario(@PathVariable String username) {
		Optional<User> usuario = userRepository.findByUsuario(username);

		if (usuario.isPresent()) {
			try {
				return usuario.get().getTarefas();
			} catch(Exception e) {
				return null;
			}
		} else {
			return null;
		}
	}

	@DeleteMapping("/users/{username}/tarefas/{idTarefa}")
	public void excluirTarefa(@PathVariable String username, @PathVariable int idTarefa) {
		tarefaRepository.deleteById(idTarefa);
	}

}
