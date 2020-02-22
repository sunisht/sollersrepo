import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MathhomeComponent } from './mathhome.component';

describe('MathhomeComponent', () => {
  let component: MathhomeComponent;
  let fixture: ComponentFixture<MathhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MathhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MathhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
