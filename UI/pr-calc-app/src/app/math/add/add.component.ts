import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.scss']
})
export class AddComponent implements OnInit {

  firstNumber: string;
  secondNumber: string;
  result: number;
  constructor(private service: DataService) { }

  ngOnInit() {
  }

  addNumber() {
    this.service.getAddResult(this.firstNumber, this.secondNumber).subscribe(data => this.result = data);
  }
}
