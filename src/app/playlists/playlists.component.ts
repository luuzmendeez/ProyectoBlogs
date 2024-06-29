import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ItemCardComponent } from '../shared/item-card/item-card.component';
import { PlaylistsService } from '../services/playlists.service';
import { SpotifyService } from '../services/spotify.service';
import { PlaylistDetailComponent } from '../playlist-detail/playlist-detail.component';

interface Song {
  id: string;
  name: string;
  artist: string;
  album: string;
  uri: string;
  image: string;
}

interface Playlist {
  name: string;
  description: string;
  image: string;
  songs: Song[];
}

@Component({
  selector: 'app-playlists',
  standalone: true,
  imports: [CommonModule, ItemCardComponent, FormsModule, PlaylistDetailComponent],
  templateUrl: './playlists.component.html',
  styleUrls: ['./playlists.component.css'],
  providers: [PlaylistsService, SpotifyService]
})
export class PlaylistsComponent {
  playlists = this.playlistsService.getPlaylists();
  showAddPlaylistForm = false;
  newPlaylist: Playlist = {
    name: '',
    description: '',
    image: '',
    songs: []
  };
  selectedPlaylist: Playlist | null = null;

  constructor(private playlistsService: PlaylistsService) {}

  onImageSelected(event: any) {
    const file = event.target.files[0];
    if (file) {
      const reader = new FileReader();
      reader.onload = () => {
        this.newPlaylist.image = reader.result as string;
      };
      reader.readAsDataURL(file);
    }
  }

  onSubmit() {
    this.playlistsService.addPlaylist({ ...this.newPlaylist });
    this.newPlaylist = { name: '', description: '', image: '', songs: [] };
    this.showAddPlaylistForm = false;
  }

  selectPlaylist(playlist: Playlist) {
    this.selectedPlaylist = playlist;
  }
}
