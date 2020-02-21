import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class MathService {

  constructor(private http: HttpClient) { }


    save (myNumber){ 
    console.log("Saving") 
    console.log(myNumber.firstNumber);
    console.log(myNumber.secondNumber);

    let numberUrl="http://localhost:8080/App" 
    return this.http.post(numberUrl,myNumber) ;
    } 

    myNumberUrl="http://localhost:8080/App"
    getNumbers()
    {
      return this.http.get(this.myNumberUrl);
      
    }

    addition (number){
      
      console.log(number.firstNumber);
     let addNumberUrl="http://localhost:8080/App/addition"+"/"+number.firstNumber+"/"+number.secondNumber;
     return this.http.post(addNumberUrl,number) ;

    }
    subtraction (number){
      
      console.log(number.firstNumber);
     let subNumberUrl="http://localhost:8080/App/subtraction"+"/"+number.firstNumber+"/"+number.secondNumber;
     return this.http.post(subNumberUrl,number) ;

    }


}
