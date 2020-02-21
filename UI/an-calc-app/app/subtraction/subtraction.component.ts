import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import {MathServiceService} from '../math-service.service';
@Component({
  selector: 'app-subtraction',
  templateUrl: './subtraction.component.html',
  styleUrls: ['./subtraction.component.scss']
})
export class SubtractionComponent implements OnInit {
  firstNumber;
  secondNumber;
  result;
  http: any;
  constructor(private mathServiceService: MathServiceService) { 
  this.firstNumber = mathServiceService.firstNumber;
  this.secondNumber= mathServiceService.secondNumber;
  this.result = mathServiceService.result;
  }
  subtractionForm = new FormGroup ({
 FirstNumber: new FormControl(''),
 SecondNumber: new FormControl(''),
 });
  ngOnInit(): void {
  }

  subtract (firstNumber, secondNumber) {
    console.log()
    let subtractUrl="http://localhost:8080/add/${firstNumber}/${secondNumber}"
    return this.http.get(subtractUrl)
    
    
 
  }
}
