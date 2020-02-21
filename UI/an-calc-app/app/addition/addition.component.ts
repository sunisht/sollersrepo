import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import { MathServiceService } from '../math-service.service';

@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {
firstNumber;
secondNumber;
result;
  http: any;
  constructor(private mathServiceService: MathServiceService) {
  this.firstNumber = mathServiceService.firstNumber;
  this.secondNumber = mathServiceService.secondNumber;
  this.result = mathServiceService.result;
  } 
  additionForm = new FormGroup({
   firstNumber: new FormControl(''),
   secondNumber: new FormControl(''),
  
  });
  
   
  
  
  

  ngOnInit(): void {
  }
  add (firstNumber, secondNumber) {
    console.log()
    let addUrl="http://localhost:8080/add/${firstNumber}/${secondNumber}"
    return this.http.get(addUrl)
    .pipe(catchError(this.handleError)
    );
    }
  }