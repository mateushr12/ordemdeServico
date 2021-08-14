package ordemServico.controller;

import ordemServico.model.*;
import ordemServico.repository.*;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrdemController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ExameRepository exameRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private OrdemRepository ordemRepository;

    @Autowired
    private PostoRepository postoRepository;

    @GetMapping("/pacientes")
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @GetMapping("/exames")
    public  List<Exame> getAllExames() {
        return exameRepository.findAll();
    }

    @GetMapping("/medicos")
    public  List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    @GetMapping("/postoDeAtendimento")
    public List<PostoColeta> getAllPosto() {
        return postoRepository.findAll();
    }

    @PostMapping("/ordem")
    public ResponseEntity<Ordem> createOrdem (@Valid @RequestBody Ordem ordem){
        //return ordemRepository.save(ordem);
        Ordem ordemSalva = ordemRepository.save(ordem);
        if(ordemRepository.findById(ordemSalva.getId()).isPresent())
            return new ResponseEntity<Ordem>(ordemSalva, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/ordem")
    public List<Ordem> getAllOrdens() {
        return ordemRepository.findAll();
    }

    @GetMapping("/ordem/{id}")
    public ResponseEntity<Ordem> getOrdem(@PathVariable Long id){
        Optional<Ordem> ordem = ordemRepository.findById(id);
        if(ordem.isPresent())
            return new ResponseEntity<Ordem>(ordem.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }





}
