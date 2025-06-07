package dsw.projeto_rest.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dsw.projeto_rest.postagem.Postagem;
import dsw.projeto_rest.tarefa.Tarefa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity(name="user_details")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique = true)
	@NotNull
	private String usuario;
	
	@Size(min=3, message="O nome deve conter pelo menos 3 letras")
	private String nome;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<Postagem> postagens;

	@OneToMany(mappedBy="usuario")
	@JsonIgnore
	private List<Tarefa> tarefas;

	public User() {
		super();
	}

	public User(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public @NotNull String getUsuario() {
		return usuario;
	}

	public void setUsuario(@NotNull String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", usuario='" + usuario + '\'' +
				", nome='" + nome + '\'' +
				", postagens=" + postagens +
				", tarefas=" + tarefas +
				'}';
	}
}
