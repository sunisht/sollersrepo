import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MathhomeComponent } from './mathhome/mathhome.component';

const routes: Routes  = [{ path: '', component: MathhomeComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MathRoutingModule { }
