import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-math-home',
  templateUrl: './math-home.component.html',
  styleUrls: ['./math-home.component.scss']
})
export class MathHomeComponent implements OnInit {

  constructor() { }
  additionForm = new FormGroup({
    firstNumber: new FormControl(''),
    secondNumber: new FormControl(''),
   
   });
   subtractionForm = new FormGroup ({
    FirstNumber: new FormControl(''),
    SecondNumber: new FormControl(''),
    });

  ngOnInit(): void {
  }

}
