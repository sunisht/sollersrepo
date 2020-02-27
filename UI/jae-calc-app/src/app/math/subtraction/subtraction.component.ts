import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { MathService } from 'src/app/math/math.service';

@Component({
  selector: 'app-subtraction',
  templateUrl: './subtraction.component.html',
  styleUrls: ['./subtraction.component.scss']
})
export class SubtractionComponent implements OnInit {

  result
  SubtractionForm = new FormGroup({
    firstNumber: new FormControl('', [Validators.required, Validators.pattern("^[0-9]*$")]),
    secondNumber: new FormControl('', [Validators.required, Validators.pattern("^[0-9]*$")]),
  });

  constructor(private subtractionService: MathService) {
  }

  ngOnInit() {

  }

  subtract() {
    this.subtractionService.saveSubtraction(this.SubtractionForm.value)
      .subscribe((data: any) => {
        this.result = data.difference;
        console.log(data)
        this.subtractionService.showSubtractions();
      });;
  }

  onFormSubmit() {
    this.subtract();
  }

  onReset(){
    this.SubtractionForm.reset();
  }
}
