import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ItemCardComponent } from '../shared/item-card/item-card.component';

@Component({
  selector: 'app-videojuegos',
  standalone: true,
  imports: [CommonModule, ItemCardComponent],
  templateUrl: './videojuegos.component.html',
  styleUrls: ['./videojuegos.component.css']
})
export class VideojuegosComponent {
  videojuegos = [
    { image: 'assets/imagenes/videojuego.jpeg', name: 'Nombre colección 1', description: 'Descripción 1' },
  ];

  addVideojuego() {
    const newVideojuego = { image: 'assets/imagenes/videojuego.jpeg', name: 'Nueva Colección', description: 'Descripción' };
    this.videojuegos.push(newVideojuego);
  }
}
