import { Component } from '@angular/core';
import { VideojuegosComponent } from '../videojuegos/videojuegos.component';
import { NotasComponent } from '../notas/notas.component';
import { PlaylistsComponent } from '../playlists/playlists.component';
import { HeaderComponent } from '../header/header.component';

@Component({
  selector: 'app-blog-detallado',
  standalone: true,
  imports: [VideojuegosComponent, NotasComponent, PlaylistsComponent, HeaderComponent],
  templateUrl: './blog-detallado.component.html',
  styleUrl: './blog-detallado.component.css'
})
export class BlogDetalladoComponent {

}
