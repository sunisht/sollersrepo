import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import { MathServiceService } from '../math-service.service';
import { Subscriber } from 'rxjs';

@Component({
  selector: 'app-addition',
  templateUrl: './addition.component.html',
  styleUrls: ['./addition.component.scss']
})
export class AdditionComponent implements OnInit {
  firstNumber;
  secondNumber;
  result;
  
  constructor(private mathServiceService: MathServiceService) {} 
 
 
  
   
  ngOnInit(): void {
  }

  add () {
    console.log("hello");
      this.mathServiceService.add(this.firstNumber,this.secondNumber)
      .subscribe ((data :any)=>{
      this.result=data.sum;
      console.log(data);

      })
    
    }
}
    
    
  
