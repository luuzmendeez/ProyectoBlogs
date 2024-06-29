import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { SpotifyService } from '../services/spotify.service';

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
  selector: 'app-playlist-detail',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './playlist-detail.component.html',
  styleUrls: ['./playlist-detail.component.css']
})
export class PlaylistDetailComponent {
  @Input() playlist: Playlist | null = null;
  searchQuery = '';
  searchResults: any[] = [];

  constructor(private spotifyService: SpotifyService) {}

  searchSongs() {
    if (this.searchQuery) {
      this.spotifyService.searchTracks(this.searchQuery).subscribe(results => {
        this.searchResults = results.tracks.items;
        console.log(this.searchResults); // Agrega un log para depurar
      });
    }
  }

  addSongToPlaylist(song: any) {
    const songToAdd: Song = {
      id: song.id,
      name: song.name,
      artist: song.artists[0].name,
      album: song.album.name,
      uri: song.uri,
      image: song.album.images[0].url
    };

    this.playlist?.songs.push(songToAdd);
  }
}
