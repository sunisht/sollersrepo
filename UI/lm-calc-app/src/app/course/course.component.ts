import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { SingletonService } from '../singleton.service';
import { CourseService } from './course.service';
import { EnrollmentService } from '../enrollment.service';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.scss']
})

export class CourseComponent implements OnInit {
user
courses

  constructor(private singleton :SingletonService,
    private courseService: CourseService, private enrollmentService: EnrollmentService) { 
    this.user = singleton.student.student.firstName;
    this.courseService.courses.subscribe((data) => {
      this.courses = data;
    }); 

  }

  
  

courseForm = new FormGroup({
  number1: new FormControl('', Validators.required),
  number2: new FormControl('',[Validators.maxLength(20),Validators.minLength(5)]),
  image: new FormControl(''),
  address: new FormGroup({
    street: new FormControl(''),
    city: new FormControl(''),
  })
});

  

  ngOnInit() {
  }

  getColor(likes){
    switch(likes){
      case (100):
        return 'red';
      case (50):
        return 'blue';
      default :
        return 'purple';
    }
  }

  onEnroll(course){
    this.enrollmentService.enroll(course);
}

  onFormSubmit(){
    let newCourse =this.courseForm.value;
    console.log(this.courseForm.value);
    newCourse.likes=0;
    newCourse.facultyLoves=0;
    newCourse.enabled=true;
    
    this.courses.push(newCourse);
    this.courseForm.reset();
    }

  editCourse(course){

  }

    
  updatePartial() {
    this.courseForm.patchValue({
      course: 'Jira',
      address: {
        street: '123 Drew Street'
      }
    });
  }
  


  
}
