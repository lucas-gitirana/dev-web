package dsw.projeto_rest.user;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dsw.projeto_rest.postagem.Postagem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity(name="user_details")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=3, message="O nome deve conter pelo menos 3 letras")
	private String nome;
	
	@OneToMany(mappedBy="user")
	@JsonIgnore
	private List<Postagem> postagens;

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

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + "]";
	}
	
}
