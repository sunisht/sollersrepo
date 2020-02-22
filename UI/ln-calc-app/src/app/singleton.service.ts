import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SingletonService {
  student={
    id:1,
    student:{
      firstName:"John",
      lastName:"Smith",
      phone:"123",
      email:"john@abc.com"
    }
  }

  constructor() {
    
   }
}
