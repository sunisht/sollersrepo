import { Injectable } from '@angular/core';
import { BehaviorSubject, throwError } from 'rxjs';
import { HttpClient, HttpErrorResponse,HttpHeaders } from '@angular/common/http';
import { catchError } from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class MathService {
  public operations: BehaviorSubject<any> = new BehaviorSubject<any>([]);

  operationsUrl = "http://localhost:8080/Operations"

  constructor(private http: HttpClient) {

  }
  
 private handleError(error: HttpErrorResponse) {
  if (error.error instanceof ErrorEvent) {
    // A client-side or network error occurred. Handle it accordingly.
    console.error('An error occurred:', error.error.message);
  } else {
    // The backend returned an unsuccessful response code.
    // The response body may contain clues as to what went wrong,
    console.error(
      `Backend returned code ${error.status}, ` +
      `body was: ${error.error}`);
  }
  // return an observable with a user-facing error message
  return throwError(
    'We have ab error.');
};


  add(operation) {
    console.log("adding in the backend")
    let operationeUrl = "http://localhost:8080/Addition"
    return this.http.post(operationeUrl, operation)
      .pipe(
        catchError(this.handleError)
      );
  }

  subtract(operation) {
    console.log("Saving")
    let operationeUrl = "http://localhost:8080/Subtraction"
    return this.http.post(operationeUrl, operation)
      .pipe(
        catchError(this.handleError)
      );
  }


  showOperations() {
    this.getOperations()
      .subscribe((data: any) => {
        this.operations.next(data);
        console.log("math services" + data)
      });
  }
  
  getOperations() {
    return this.http.get(this.operationsUrl)
      .pipe(catchError(this.handleError))
    
  }



}
