package twjava.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import twjava.twgerenciadortarefas.modelos.Tarefa;

import java.util.List;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> CarregarTarefasPorUsuario(@Param("emailUsuario") String email);
}
