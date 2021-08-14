package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_ordem_exame")
public class OrdemExame {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_id")
    private Ordem ordemId;

    @ManyToOne
    @JoinColumn(name = "exame_id")
    private Exame exameId;

    @NotNull
    private Double preco;

}
