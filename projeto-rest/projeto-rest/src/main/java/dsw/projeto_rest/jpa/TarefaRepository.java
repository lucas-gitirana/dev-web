package dsw.projeto_rest.jpa;

import dsw.projeto_rest.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {


}
