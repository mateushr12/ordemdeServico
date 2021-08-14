package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "tb_medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String especilidade;


}
