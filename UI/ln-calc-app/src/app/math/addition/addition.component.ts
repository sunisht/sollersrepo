import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MathService } from 'src/app/math.service';


@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {

  operations: any[]
   backendResult
  constructor(private mathServices: MathService) {
    this.backendResult = 0;
  }

  ngOnInit() {  
  }

  additionForm = new FormGroup({
    number1: new FormControl('', Validators.required),
    number2: new FormControl('', [Validators.maxLength(20), Validators.minLength(5)])
  });

  onFormSubmit() {
    let newOperation = this.additionForm.value;
     this.mathServices.add(newOperation)
      .subscribe((data: any) => {
        this.mathServices.showOperations();
        this.backendResult = data.result;
      });
  }

  onReset() {
    console.log("resetting")
    this.backendResult = 0;
    this.additionForm.reset();
  }





}
