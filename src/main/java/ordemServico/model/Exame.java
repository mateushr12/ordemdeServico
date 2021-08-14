package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tb_exame")
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private String descricao;

    @NotNull
    private Double preco;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "exames")
    private Set<Ordem> ordens;

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Set<Ordem> getOrdens() {
        return ordens;
    }

    public void setOrdens(Set<Ordem> ordens) {
        this.ordens = ordens;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "id=" + getId() +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", ordens=" + getOrdens() +
                '}';
    }
}
