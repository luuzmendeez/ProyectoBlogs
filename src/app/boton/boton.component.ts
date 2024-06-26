import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-boton',
  standalone: true,
  imports: [CommonModule,],
  templateUrl: './boton.component.html',
  styleUrl: './boton.component.css'
})
export class BotonComponent {
  @Input() label: string = ''; 
  @Input() link: string = '/';
}
