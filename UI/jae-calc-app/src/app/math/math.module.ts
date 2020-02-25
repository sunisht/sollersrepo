import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';


import { MathRoutingModule } from './math-routing.module';
import { AdditionComponent } from './addition/addition.component';
import { SubtractionComponent } from './subtraction/subtraction.component';
import { MathHomeComponent } from './math-home/math-home.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ViewComponent } from './view/view.component';



@NgModule({
  declarations: [AdditionComponent, SubtractionComponent, MathHomeComponent, ViewComponent],
  imports: [
    CommonModule,
    MathRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class MathModule { }
