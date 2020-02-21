import { Component, OnInit } from '@angular/core';
import { EnrollmentService } from '../enrollment.service';

@Component({
  selector: 'app-enrollment',
  templateUrl: './enrollment.component.html',
  styleUrls: ['./enrollment.component.scss']
})
export class EnrollmentComponent implements OnInit {

  enrollments
  constructor(private enrollementService:EnrollmentService) { }

  ngOnInit() {
    this.enrollementService.enrollments.subscribe((data) => {
      this.enrollments= data;
    });
  }

}
