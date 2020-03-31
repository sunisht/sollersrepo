import { Injectable } from '@angular/core';
import { BehaviorSubject, throwError } from 'rxjs';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { tap, map, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MathService {

  local_ip="34.68.98.102"
  additionUrl = "http://"+this.local_ip+":8080/Addition"
  subtractionUrl = "http://"+this.local_ip+":8080/Subtraction"


  public additions: BehaviorSubject<any> = new BehaviorSubject<any>([]);
  public subtractions: BehaviorSubject<any> = new BehaviorSubject<any>([]);
  constructor(private http: HttpClient) {

  }

  closeAddition(addition){
    return this.http.delete(this.additionUrl+"/Delete//" + addition.id)      
  }
  closeSubtraction(subtraction){
    return this.http.delete(this.subtractionUrl+"/Delete/"+subtraction.id)

  }

  saveAddition(addition){
    return this.http.post(this.additionUrl, addition)
      .pipe(
        catchError(this.handleError)
      );
  }
  saveSubtraction(subtraction){
    return this.http.post(this.subtractionUrl, subtraction)
      .pipe(
        catchError(this.handleError)
      );
  }

  getAdditions() {
    return this.http.get(this.additionUrl)
      .pipe(
        catchError(this.handleError)
      );
  }

  getSubtractions(){
    return this.http.get(this.subtractionUrl)
      .pipe(
        catchError(this.handleError)
      );
  }

  showAdditions() {
    this.getAdditions()
      .subscribe((data: any) => {
        this.additions.next(data);
      });
  }

  showSubtractions() {
    this.getSubtractions()
      .subscribe((data: any) => {
        this.subtractions.next(data);
      });
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
      'We have an error.');
  };
}
