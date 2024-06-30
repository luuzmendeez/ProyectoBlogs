//services/playlist.service.ts
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Playlist } from '../model/Playlist';

@Injectable({
  providedIn: 'root'
})
export class PlaylistService {
  private urlEndPoint: string = 'http://localhost:8082/apiPlaylist/playlists';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json',
  });

  constructor(private http: HttpClient) { }

  mostrarPlaylists(): Observable<Playlist[]> {
    return this.http
      .get<Playlist[]>(this.urlEndPoint)
      .pipe(map((response) => response as Playlist[]));
  }

  mostrarPlaylist(id: number): Observable<Playlist> {
    return this.http.get<Playlist>(`${this.urlEndPoint}/${id}`);
  }

  eliminarPlaylist(id: number): Observable<void> {
    return this.http.delete<void>(`${this.urlEndPoint}/${id}`, {
      headers: this.httpHeaders
    });
  }

  crearPlaylist(playlist: Playlist): Observable<Playlist> {
    return this.http.post<Playlist>(
      this.urlEndPoint,
      playlist,
      {
        headers: this.httpHeaders
      }
    );
  }

  actualizarPlaylist(playlist: Playlist): Observable<Playlist> {
    return this.http.put<Playlist>(
      `${this.urlEndPoint}/${playlist.idPlaylist}`,
      playlist,
      {
        headers: this.httpHeaders
      }
    );
  }
}
