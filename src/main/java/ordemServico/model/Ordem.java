package ordemServico.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "tb_ordem")
public class Ordem {

    public Ordem() {}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @NotNull
    private LocalDate data;

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente pacienteId;

    @NotNull
    private String convenio;

    @ManyToOne
    @JoinColumn(name = "postocoleta_id")
    private PostoColeta postocoletaId;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medicoId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "tab_ordem_exame",
            joinColumns = {@JoinColumn(name = "orderm_id")},
            inverseJoinColumns = {@JoinColumn (name = "exame_id")})
    private Set<Exame> exames;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Paciente getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId( Integer id) {
        this.pacienteId = pacienteId;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public PostoColeta getPostocoletaId() {
        return postocoletaId;
    }

    public void setPostocoletaId(PostoColeta postocoletaId) {
        this.postocoletaId = postocoletaId;
    }

    public Medico getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Medico medicoId) {
        this.medicoId = medicoId;
    }

    public Set<Exame> getExames() {
        return exames;
    }

    public void setExames(Set<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public String toString() {
        return "Ordem{" +
                "id=" + getId() +
                ", data=" + getData() +
                ", pacienteId=" + getPacienteId() +
                ", convenio='" + getConvenio() + '\'' +
                ", postocoletaId=" + getPostocoletaId() +
                ", medicoId=" + getMedicoId() +
                ", exames=" + getExames() +
                '}';
    }


}
