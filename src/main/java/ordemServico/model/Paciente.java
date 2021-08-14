package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private LocalDate data_nascimento;

    @NotNull
    private String sexo;

    @NotNull
    private String endereco;

}
