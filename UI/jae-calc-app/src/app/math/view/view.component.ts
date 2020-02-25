import { Component, OnInit } from '@angular/core';
import { MathService } from 'src/app/math/math.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class ViewComponent implements OnInit {

  operations
  addViews
  subtractViews
  result
  constructor(private mathService: MathService) {

  }

  ngOnInit() {
    this.mathService.showAdditions();
    this.mathService.additions.subscribe((data) => {
      this.addViews = data;
      this.addViews = this.addViews.slice().reverse();
    });
    this.mathService.showSubtractions();
    this.mathService.subtractions.subscribe((data) => {
      this.subtractViews = data;
      this.subtractViews = this.subtractViews.slice().reverse();
    });
  }
}

