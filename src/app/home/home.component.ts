import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from '../header/header.component';
import { BlogCardComponent } from '../blog-card/blog-card.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HeaderComponent, BlogCardComponent, CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  blogs = [
    {
      imageUrl: 'assets/imagenes/i1.jpeg',
      title: 'Nombre del blog',
      description: 'Description of your first project'
    },
    {
      imageUrl: 'assets/imagenes/i2.jpeg',
      title: 'Nombre del blog',
      description: 'Description of your second work'
    },
    {
      imageUrl: 'assets/imagenes/i3.jpeg',
      title: 'Nombre del blog',
      description: 'Description of your third creation'
    },
    {
      imageUrl: 'assets/imagenes/i4.jpeg',
      title: 'Nombre del blog',
      description: 'Description of your fourth endeavor'
    }
  ];
}
