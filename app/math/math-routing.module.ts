import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {additionComponent} from './addition/addition.component';
import {subtractionComponent} from './subtraction/subtraction.component';
import { MathRoutingModule } from './math-routing.module';
import { MathHomeComponent } from '../math-home/math-home.component';

const routes: Routes =  [{ path: 'home', component: MathHomeComponent },
                        {path: 'add', component: additionComponent},
                        {path: 'subtract', component: subtractionComponent}];
            
                        



@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MathRoutingModule { }
