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

  closeAdditionButton(add) {
    this.mathService.closeAddition(add)
    .subscribe((data: any) => {
      console.log("Deleting addition item complete")
      this.mathService.showAdditions()
    })
  }

  closeSubtractionButton(subtract) {
    this.mathService.closeSubtraction(subtract)
    .subscribe((data: any) => {
      console.log("Deleting subtraction item complete")
      this.mathService.showSubtractions()
    })
  }
}

