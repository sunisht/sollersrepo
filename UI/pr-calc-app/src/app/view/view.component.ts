import { Component, OnInit } from '@angular/core';
import { MathService } from '../math.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {

  myNumber:any[]

  constructor(private mathService: MathService) { }

  ngOnInit() {

    this.showNumber();

  }

  showNumber() {
    this.mathService.getNumbers()
      .subscribe((data:any) => {
        this.myNumber =data
        console.log(data)
      });
  }

  viewHistory()
  {
    this.showNumber();

  }

}
