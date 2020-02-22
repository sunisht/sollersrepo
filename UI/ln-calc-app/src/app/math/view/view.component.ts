import { Component, OnInit } from '@angular/core';
import { MathService } from 'src/app/math.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {

  operations: any[]
  constructor(private mathServices: MathService) {
  }

  ngOnInit() {
    this.mathServices.showOperations();
    this.mathServices.operations.subscribe((data) => {
      this.operations = data;
    });
  }


  

}
