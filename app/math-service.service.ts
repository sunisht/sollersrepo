import { Injectable } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { ReturnStatement } from '@angular/compiler';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MathServiceService {
  MathServiceService: any;
  

  constructor(private http:HttpClient) { }

  subtract (firstNumber, secondNumber) {
     console.log()
      let subtractUrl="http://localhost:8080/subtract/${firstNumber}/${secondNumber}"
      return this.http.get(subtractUrl)
  }

  add (firstNumber, secondNumber) {
    console.log()
    let addUrl="http://localhost:8080/add/${firstNumber}/${secondNumber}"
    return this.http.get(addUrl)
  }   
 showAdd(){
  this.MathServiceService.save(this.add)
  .subscribe((data:any) => {
    this.showAdd();
    console.log(data)
  });

 }
  }
