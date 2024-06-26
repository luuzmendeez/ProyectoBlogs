import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ItemCardComponent } from '../shared/item-card/item-card.component';

@Component({
  selector: 'app-notas',
  standalone: true,
  imports: [CommonModule, ItemCardComponent],
  templateUrl: './notas.component.html',
  styleUrls: ['./notas.component.css']
})
export class NotasComponent {
  notas = [
    { image: 'assets/imagenes/nota.jpeg', name: 'Nota 1', description: 'Descripción 1' },
  ];

  addNota() {
    const newNota = { image: 'assets/imagenes/nota.jpeg', name: 'Nueva Nota', description: 'Descripción' };
    this.notas.push(newNota);
  }
}
