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

  constructor(private mathServiceService: MathServiceService) {  }
  subtractionForm = new FormGroup ({
 FirstNumber: new FormControl(''),
 SecondNumber: new FormControl(''),
 });
  ngOnInit(): void {
  }

  
  subtract(){
    this.mathServiceService.subtract(this.firstNumber, this.secondNumber)
    .subscribe((data:any) =>{
    this.result=data.result;
    console.log(data);
    });
    
  }
}
