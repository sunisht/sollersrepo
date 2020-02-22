import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'subtraction-app',
  templateUrl: './subtraction.component.html',
  styleUrls: ['./subtraction.component.scss']
})
export class SubtractionComponent implements OnInit {

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

   subtractionForm = new FormGroup({
     number1: new FormControl('', Validators.required),
     number2: new FormControl('', [Validators.maxLength(20), Validators.minLength(5)])
   });

   onFormSubmit() {
     let newOperation = this.subtractionForm.value;

     console.log(newOperation);
     this.mathServices.save(newOperation)
       .subscribe((data: any) => {
         this.showOperationsWithError();
         console.log(data)
       });

     this.subtractionForm.reset();
}
