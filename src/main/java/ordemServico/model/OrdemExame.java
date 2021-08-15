package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_ordem_exame")
public class OrdemExame {

    public OrdemExame() {}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private Ordem ordemId;

    @ManyToOne
    @JoinColumn(name = "exame_id")
    private Exame exameId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ordem getOrdemId() {
        return ordemId;
    }

    public void setOrdemId(Ordem ordemId) {
        this.ordemId = ordemId;
    }

    public Exame getExameId() {
        return exameId;
    }

    public void setExameId(Exame exameId) {
        this.exameId = exameId;
    }

    @Override
    public String toString() {
        return "OrdemExame{" +
                "id=" + getId() +
                ", ordemId=" + getOrdemId() +
                ", exameId=" + getExameId() +
                '}';
    }
}
