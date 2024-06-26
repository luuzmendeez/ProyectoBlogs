import { Component } from '@angular/core';
import { NavbarhComponent } from '../navbarh/navbarh.component';
import { BotonComponent } from '../boton/boton.component';

@Component({
  selector: 'app-landing',
  standalone: true,
  imports: [NavbarhComponent, BotonComponent],
  templateUrl: './landing.component.html',
  styleUrl: './landing.component.css'
})
export class LandingComponent {

}
