import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MathService } from 'src/app/math/math.service';

@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {

  additions
  result
  AdditionForm = new FormGroup({
    firstNumber: new FormControl('', [Validators.required,Validators.pattern("^[0-9]*$")]),
    secondNumber: new FormControl('', [Validators.required, Validators.pattern("^[0-9]*$")]),
  });

  constructor(private additionService: MathService) {
  }

  ngOnInit() {
  }

  add() {
    this.additionService.saveAddition(this.AdditionForm.value)
      .subscribe((data: any) => {
        this.result = data.sum;
        console.log(data)
        this.additionService.showAdditions();
      });
  }  

  onFormSubmit() {
    this.add();
  }
}
