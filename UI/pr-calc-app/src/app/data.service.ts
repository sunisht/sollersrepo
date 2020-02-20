import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private httpclient: HttpClient) { }

  // Http Options

  getAddResult(num1: string, num2: string): Observable<any> {
    return this.httpclient.get("http://localhost:8080/addition/" + num1 + "/" + num2);
  }

  getSubstractResult(num1: string, num2: string): Observable<any> {
    return this.httpclient.get("http://localhost:8080/subtraction/" + num1 + "/" + num2);
  }
}
