import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { MathRoutingModule } from './math-routing.module';
import { AddComponent } from './add/add.component';
import { SubtractComponent } from './subtract/subtract.component';
import { MathhomeComponent } from './mathhome/mathhome.component';
import { DataService } from '../data.service';

@NgModule({
  declarations: [AddComponent, SubtractComponent, MathhomeComponent],
  imports: [
    CommonModule,
    MathRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [DataService],
})
export class MathModule { }