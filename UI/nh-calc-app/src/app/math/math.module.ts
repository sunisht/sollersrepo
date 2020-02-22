import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MathRoutingModule } from './math-routing.module';
import { AdditionComponent } from './addition/addition.component';
import { SubtractionComponent } from './subtraction/subtraction.component';
import { MathHomeComponent } from './math-home/math-home.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [AdditionComponent, SubtractionComponent, MathHomeComponent],
  imports: [
    CommonModule,
    MathRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ]
})
export class MathModule { }
