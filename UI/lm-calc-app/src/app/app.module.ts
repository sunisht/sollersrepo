import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CourseComponent } from './course/course.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { EnrollmentComponent } from './enrollment/enrollment.component';
import { MathModule } from './math/math.module';


@NgModule({
  declarations: [
    AppComponent,
    CourseComponent,
    EnrollmentComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    MathModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
