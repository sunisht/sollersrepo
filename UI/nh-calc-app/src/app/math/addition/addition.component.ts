import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MathService } from 'src/app/math.service';


@Component({
  selector: 'addition-app',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {

  operations: any[]
  constructor(private mathServices: MathService) {
    this.mathServices.operations.subscribe((data) => {
      this.operations = data;
    });
  }

  ngOnInit() {
    this.showOperationsWithError();
    this.mathServices.operations.subscribe((data) => {
      this.operations = data;
    });
  }



  getOperationsWithHeader() {
    this.mathServices.getOperationsWithHeader()
      .subscribe((data: any) => {
        this.operations = data
        console.log(data)
      });
  }
  showOperationsWithError() {
    this.mathServices.getOperationsWithError()
      .subscribe((data: any) => {
        this.operations = data
        console.log(data)
      });
  }

  additionForm = new FormGroup({
    number1: new FormControl('', Validators.required),
    number2: new FormControl('', [Validators.maxLength(20), Validators.minLength(5)])
  });

  onFormSubmit() {
    let newOperation = this.additionForm.value;

    console.log(newOperation);
    this.mathServices.save(newOperation)
      .subscribe((data: any) => {
        this.showOperationsWithError();
        console.log(data)
      });

    this.additionForm.reset();
  }





}
