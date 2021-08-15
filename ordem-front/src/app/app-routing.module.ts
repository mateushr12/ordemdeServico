import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { NovaComponent } from './components/ordem/nova/nova.component';


const routes: Routes = [
  {
    path: '',
    component: NovaComponent
  },  
  {
    path: 'ordemNova',
    component: NovaComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
