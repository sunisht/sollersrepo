import { Component, OnInit } from '@angular/core';

import { FormGroup, FormControl } from '@angular/forms';
import { MathService } from '../math.service';



@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {

  myNumber:any[];
  result;
  constructor(private mathService: MathService
   ) { }

  ngOnInit() {
  }

  numberForm = new FormGroup({
    firstNumber: new FormControl(''),
    secondNumber: new FormControl(''),
  });
  onSubmit() {

     this.myNumber=this.numberForm.value;
     let result= parseInt(this.myNumber['firstNumber'] )  +parseInt(this.myNumber['secondNumber']);
     this.result=result;
      

       let myActualNumber={
        'firstNumber':parseInt(this.myNumber['firstNumber'] ),
        'secondNumber':parseInt(this.myNumber['secondNumber'] ),
       }



       this.mathService.addition(myActualNumber) 
       .subscribe((data:any) => { 
       
       console.log(data) 
       }); 

      

  }
  
}
