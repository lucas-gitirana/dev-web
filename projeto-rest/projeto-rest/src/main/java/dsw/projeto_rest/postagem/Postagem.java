package dsw.projeto_rest.postagem;

import com.fasterxml.jackson.annotation.JsonIgnore;

import dsw.projeto_rest.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Postagem {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2)
	private String mensagem;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private User user;

	public Postagem() {
	}

	public Postagem(Integer id, @Size(min = 2) String mensagem, User user) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Postagem [id=" + id + ", mensagem=" + mensagem + ", user=" + user + "]";
	}
	
}
