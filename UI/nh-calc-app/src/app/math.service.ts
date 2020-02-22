import { Injectable } from '@angular/core';
import { BehaviorSubject, throwError } from 'rxjs';
import { HttpClient, HttpErrorResponse,HttpHeaders } from '@angular/common/http';
import { catchError } from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class MathService {
  public tempOperations;nhnj
  public operations: BehaviorSubject<any> = new BehaviorSubject<any>([]);

  operationsUrl = "http://localhost:8080/Operations"

  constructor(private http: HttpClient) {
    
    this.operations.next(this.tempOperations)

  }


  getAddition(double id){
       console.log("Retrieving")
      return this.http.get(this.subtraction, Addition)
      .pipe(
        catchError(this.handleError)
        );
    }

    getAddition(double id){
           console.log("Retrieving")
          return this.http.get(this.subtraction, subtraction)
          .pipe(
            catchError(this.handleError)
            );
        }
  
 private handleError(error: HttpErrorResponse) {
  if (error.error instanceof ErrorEvent) {
    console.error('An error occurred:', error.error.message);
  } else {
    console.error(
      `Backend returned code ${error.status}, ` +
      `body was: ${error.error}`);
  }
  return throwError(
    'error.');
};


  saveAddition(operation) {
    console.log("Saving")
    let operationUrl = "http://localhost:8080/Addition"
    return this.http.post(operationUrl, operation)
      .pipe(
        catchError(this.handleError)
      );
  }

  saveSubtraction(operation) {
      console.log("Saving")
      let operationUrl = "http://localhost:8080/Subtraction"
      return this.http.post(operationUrl, operation)
        .pipe(
          catchError(this.handleError)
        );
    }


  getOperations() {
    this.http.get(this.operationsUrl)
  }

    getOperationsWithHeader() {
      const httpOptions = {
        headers: new HttpHeaders({
          'content-Type': 'application/json',
        })
      };
      return this.http.get(this.operationsUrl,httpOptions)
      .pipe(
        catchError(this.handleError)
      )
    }
  getOperationsWithError() {
    return this.http.get(this.operationsUrl)
      .pipe(catchError(this.handleError))
  }



}
