import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MathHomeComponent } from './math-home/math-home.component';


const routes: Routes = [
  {path:'', component:MathHomeComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MathRoutingModule { }
