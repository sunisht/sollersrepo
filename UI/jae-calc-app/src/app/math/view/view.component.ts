import { Component, OnInit } from '@angular/core';
import { MathService } from 'src/app/math.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.scss']
})
export class AddViewComponent implements OnInit {

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
      this.addViews= this.addViews.slice().reverse();
    });
    this.mathService.showSubtractions();
    this.mathService.subtractions.subscribe((data) => {
      this.subtractViews = data;
      this.subtractViews = this.subtractViews.slice().reverse();
    });
  }

    getViews(){
      this.mathService.getAdditions()
        .subscribe((data: any) => {
          this.addViews = data
          this.addViews = this.addViews.slice().reverse();
          console.log("add Views ",data)
        });
      this.mathService.getSubtractions()
        .subscribe((data: any) => {
          this.subtractViews = data
          this.subtractViews = this.subtractViews.slice().reverse();
          console.log("subtract Views ", data)
        });
    }
}

