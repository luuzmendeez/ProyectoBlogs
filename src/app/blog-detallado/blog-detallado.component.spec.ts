import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlogDetalladoComponent } from './blog-detallado.component';

describe('BlogDetalladoComponent', () => {
  let component: BlogDetalladoComponent;
  let fixture: ComponentFixture<BlogDetalladoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BlogDetalladoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BlogDetalladoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
