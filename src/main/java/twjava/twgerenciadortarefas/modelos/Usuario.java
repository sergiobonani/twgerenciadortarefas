package twjava.twgerenciadortarefas.modelos;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity()
@Table(name = "usr_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long Id;

    @Column(name = "usr_email", nullable = false, length = 100)
    @NotNull(message = "E-mail obrigatório")
    @Length(min = 5, max = 100, message = "E-mail deve conter entre 5 e 100 caracteres")
    private String email;

    @Column(name = "usr_senha", nullable = false, length = 100)
    @NotNull(message = "Senha obrigatória")
    private String senha;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Tarefa> Tarefas;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Tarefa> getTarefas() {
        return Tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        Tarefas = tarefas;
    }
}
