import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ItemCardComponent } from '../shared/item-card/item-card.component';

@Component({
  selector: 'app-playlists',
  standalone: true,
  imports: [CommonModule, ItemCardComponent],
  templateUrl: './playlists.component.html',
  styleUrls: ['./playlists.component.css']
})
export class PlaylistsComponent {
  playlists = [
    { image: 'assets/imagenes/playlist.jpeg', name: 'Nombre 1', description: 'Descripción 1' },
  ];

  addPlaylist() {
    const newPlaylist = { image: 'assets/imagenes/playlist.jpeg', name: 'Nueva Playlist', description: 'Descripción' };
    this.playlists.push(newPlaylist);
  }
}