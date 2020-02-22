import { Component, OnInit } from '@angular/core';

import { FormGroup, FormControl } from '@angular/forms';
import { MathService } from '../math.service';


@Component({
  selector: 'app-subtraction',
  templateUrl: './subtraction.component.html',
  styleUrls: ['./subtraction.component.scss']
})
export class SubtractionComponent implements OnInit {
  myNumber:any[];
  result;

  constructor(private mathService: MathService) { }

  ngOnInit() {
  }
  numberForm = new FormGroup({
    firstNumber: new FormControl(''),
    secondNumber: new FormControl(''),
  });
  onSubmit() {
    this.myNumber=this.numberForm.value;  
    let myActualNumber={
        'firstNumber':parseInt(this.myNumber['firstNumber'] ),
        'secondNumber':parseInt(this.myNumber['secondNumber'] )
       }

    this.mathService.subtraction(myActualNumber)
      .subscribe((data:any) => { 
      this.mathService.showOperations();
      console.log(data) 
      this.result=data.firstNumber-data.secondNumber;
      });   }

  
  
}
