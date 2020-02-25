import { Component, OnInit } from '@angular/core';

import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MathService } from '../math.service';



@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {

  myNumber:any[];
  result:any[];
  constructor(private mathService: MathService
   ) { }

  ngOnInit() {
  }

  numberForm = new FormGroup({
    firstNumber: new FormControl(''),
    secondNumber: new FormControl(''),
  });
  onSubmit() {

    this.myNumber = this.numberForm.value;
    let myActualNumber = {
      'firstNumber': this.myNumber['firstNumber'],
      'secondNumber': this.myNumber['secondNumber']
    }

    this.mathService.addition(myActualNumber)
      .subscribe((data: any) => {
        this.mathService.showOperations();
      

        console.log(data)
        this.result=data.firstNumber+data.secondNumber;
      });   
  }

  
  
}
