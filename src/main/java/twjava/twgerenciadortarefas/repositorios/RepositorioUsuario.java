package twjava.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import twjava.twgerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
