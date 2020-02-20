import { Component } from '@angular/core';
import { DataService } from './data.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  firstNumber: string;
  secondNumber: string;
  firstSubNumber: string;
  secondSubNumber: string;
  subResult: number;
  result: number;

  constructor(private service: DataService) { }

  ngOnInit() {

  }

  addNumber() {
    this.service.getAddResult(this.firstNumber,this.secondNumber).subscribe(data => this.result = data);
  }
  subtractNumber() {
    this.service.getSubstractResult(this.firstSubNumber,this.secondSubNumber).subscribe(data => this.subResult = data);
  }
  
}