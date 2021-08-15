import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { GeralService } from 'src/app/services/geral.service';

@Component({
  selector: 'app-nova',
  templateUrl: './nova.component.html',
  styleUrls: ['./nova.component.css']
})
export class NovaComponent implements OnInit {

  formulario = new FormGroup({    
    pacienteId: new FormControl('', Validators.required),
    convenio: new FormControl('', Validators.required),
    postocoletaId: new FormControl('', Validators.required),
    medicoId: new FormControl('', Validators.required),
    data: new FormControl('', Validators.required),
    exame: new FormControl('', Validators.required),
    
  });

  medicos: any[] = []
  pacientes_list: any[] = []
  postos_list: any[] = []
  exames_list: any[] = []    


  constructor(private geralService: GeralService ) { }

  ngOnInit(): void {

    this.geralService.getAllMedicos().then(response =>{
      this.medicos = response
    })

    this.geralService.getAllExames().then(response =>{
      this.exames_list = response
    })

    this.geralService.getAllPacientes().then(response =>{
      this.pacientes_list = response
    })

    this.geralService.getAllPostos().then(response =>{
      this.postos_list = response
    })


  }

  salvar() {
    // this.carregando = true;
    var ordem = this.formulario.value
    //console.log(ordem)
    this.geralService.novaOrdem(ordem).then(resultado => {
      console.log(resultado)
      // if (resultado.statusCode == 201) {
      //   this.exibirMensagemSucesso();
      //   this.iniciarFormulario();
      // } else {
      //   this.exibirMensagemErro();
      // }
      //this.carregando = false;
    })
  }


}
