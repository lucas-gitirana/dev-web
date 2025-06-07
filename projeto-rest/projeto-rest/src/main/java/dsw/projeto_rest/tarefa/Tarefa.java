package dsw.projeto_rest.tarefa;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dsw.projeto_rest.user.User;
import jakarta.persistence.*;

@Entity(name="tarefa")
public class Tarefa {

    @Id
    @GeneratedValue
    private Integer id;

    private String descricao;
    private boolean concluido;

    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    private User usuario;

    public Tarefa() {
    }

    public Tarefa(Integer id, String descricao, boolean concluido, User usuario) {
        this.id = id;
        this.descricao = descricao;
        this.concluido = concluido;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                ", usuario=" + usuario +
                '}';
    }
}
