import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GeralService {

  baseUrl = environment.API_URL;

  constructor(private http: HttpClient) { }

  getAllMedicos(): Promise<any> {    
    return new Promise((resolve, reject) => {
      this.http.get<any>(this.baseUrl + "/medicos" ).subscribe(result =>
        resolve(result),
        () => reject(500));
    });
  }

  getAllPacientes(): Promise<any> {    
    return new Promise((resolve, reject) => {
      this.http.get<any>(this.baseUrl + "/pacientes" ).subscribe(result =>
        resolve(result),
        () => reject(500));
    });
  }

  getAllExames(): Promise<any> {    
    return new Promise((resolve, reject) => {
      this.http.get<any>(this.baseUrl + "/exames" ).subscribe(result =>
        resolve(result),
        () => reject(500));
    });
  }

  getAllPostos(): Promise<any> {    
    return new Promise((resolve, reject) => {
      this.http.get<any>(this.baseUrl + "/postoDeAtendimento" ).subscribe(result =>
        resolve(result),
        () => reject(500));
    });
  }

  novaOrdem(body: any): Promise<any> {    
    return new Promise((resolve, reject) => {
      this.http.post<any>(this.baseUrl + "/ordem", body).subscribe(result =>
        resolve(result),
        () => reject(500));
    });
  }


}
