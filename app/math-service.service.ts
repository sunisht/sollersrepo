import { Injectable } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
@Injectable({
  providedIn: 'root'
})
export class MathServiceService {
  firstNumber: any;
  secondNumber: any;
  result: any;
  http: any;

  constructor() { }
  
  

  
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

}
