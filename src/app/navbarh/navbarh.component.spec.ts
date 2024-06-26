import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarhComponent } from './navbarh.component';

describe('NavbarhComponent', () => {
  let component: NavbarhComponent;
  let fixture: ComponentFixture<NavbarhComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NavbarhComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(NavbarhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
