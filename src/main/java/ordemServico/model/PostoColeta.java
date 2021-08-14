package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_posto_coleta")
public class PostoColeta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private String descricao;

    @NotNull
    private String endereco;


}
