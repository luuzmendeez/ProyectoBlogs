import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlaylistsService {
  private playlists: any[] = [];

  constructor() { }

  getPlaylists(): any[] {
    return this.playlists;
  }

  addPlaylist(playlist: any): void {
    this.playlists.push(playlist);
  }
}
