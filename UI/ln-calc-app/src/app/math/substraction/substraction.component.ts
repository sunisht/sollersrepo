import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { MathService } from 'src/app/math.service';

@Component({
  selector: 'app-substraction',
  templateUrl: './substraction.component.html',
  styleUrls: ['./substraction.component.scss']
})
export class SubstractionComponent implements OnInit {
  backendResult 
  operations: any[]

  constructor(private mathServices: MathService) {
    this.backendResult = 0;
  }

  ngOnInit() {  
  }


  subtractionForm = new FormGroup({
    number1: new FormControl('', Validators.required),
    number2: new FormControl('', [Validators.maxLength(20), Validators.minLength(5)])
  });

  onFormSubmit() {
    let newOperation = this.subtractionForm.value;
    this.mathServices.subtract(newOperation)
      .subscribe((data: any) => {
        this.mathServices.showOperations();
        this.backendResult = data.result;
      });
  }

  onReset() {
    this.backendResult = 0;
    this.subtractionForm.reset();
  }




}
