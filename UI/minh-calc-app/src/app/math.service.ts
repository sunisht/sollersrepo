import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { BehaviorSubject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class MathService {
  public operations: BehaviorSubject<any> = new BehaviorSubject<any>([]);

  constructor(private http: HttpClient) { }
     
    /**
     * This is addtion service
     * @param number 
     */

  addition (number){
      
      console.log(number.firstNumber);
     let addNumberUrl="http://localhost:8080/App/addition"+"/"+number.firstNumber+"/"+number.secondNumber;
     return this.http.post(addNumberUrl,number) ;

    }

    /**
     * This is subtraction service
     * @param number 
     */
    subtraction (number){
      
      console.log(number.firstNumber);
     let subNumberUrl="http://localhost:8080/App/subtraction"+"/"+number.firstNumber+"/"+number.secondNumber;
     return this.http.post(subNumberUrl,number) ;

    }
    
    myNumberUrl="http://localhost:8080/App"

    showOperations() {  
      this.getOperations()  
      .subscribe((data: any) => {  
      this.operations.next(data);  
      });  
      }

    getOperations() {  
        return this.http.get(this.myNumberUrl)  
         
      }

}
