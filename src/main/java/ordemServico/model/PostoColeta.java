package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_posto_coleta")
public class PostoColeta {

    public PostoColeta() {}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private String descricao;

    @NotNull
    private String endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "PostoColeta{" +
                "id=" + getId() +
                ", descricao='" + getDescricao() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }
}
