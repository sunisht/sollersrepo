import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
@Component({
  selector: 'app-subtract',
  templateUrl: './subtract.component.html',
  styleUrls: ['./subtract.component.scss']
})
export class SubtractComponent implements OnInit {

  firstSubNumber: string;
  secondSubNumber: string;
  subResult: number;
  constructor(private service: DataService) { }

  ngOnInit() {
  }
  subtractNumber() {
    this.service.getSubstractResult(this.firstSubNumber,this.secondSubNumber).subscribe(data => this.subResult = data);
  }
}
