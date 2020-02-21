import { Injectable } from '@angular/core';
import { SingletonService } from '../singleton.service';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  public tempCourses
  public courses: BehaviorSubject<any> = new BehaviorSubject<any>([])

  constructor() {
    this.tempCourses = [{
      number1: 10,
      number2: 20,
      operation: "addition",
      result: 30,
    },
    {
      number1: 10,
      number2: 20,
      operation: "addition",
      result: 30,
      
    },
    {
      number1: 10,
      number2: 20,
      operation: "addition",
      result: 30,
    }
    ]
    this.courses.next(this.tempCourses)
   // this.courses = this.tempCourses

  }
  save(course) {
    var courses = this.courses.getValue();
    courses.push(course);
    this.courses.next(courses);

  }
}
