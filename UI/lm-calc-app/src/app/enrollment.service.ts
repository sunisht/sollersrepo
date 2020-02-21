import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { SingletonService } from './singleton.service';

@Injectable({
  providedIn: 'root'
})
export class EnrollmentService {
  public enrollments: BehaviorSubject<any> = new BehaviorSubject<any>([]);
  student
  
  constructor(private singleton :SingletonService) { 
    this.student = singleton.student;
  }

  enroll(course){
    var enrollment:any = {};
    enrollment.student = this.student;
    enrollment.course = course

    var enrollmentsTemp = this.enrollments.getValue();
    enrollmentsTemp.push(enrollment);
    
    this.enrollments.next(enrollmentsTemp);
    console.log(this.enrollments.getValue());
    console.log(enrollment.course);
  }
}
