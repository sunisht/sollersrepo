import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MathHomeComponent } from './math-home/math-home.component';


const routes: Routes = [{path:'home',component:MathHomeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
