import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, switchMap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {
  private apiUrl = 'https://api.spotify.com/v1';
  private clientId = '81bf5c2705e6432aa7a43c8d4b774d9d'; 
  private clientSecret = 'aa9bacff78bd494bb5d6827533609e65'; 
  private tokenUrl = 'https://accounts.spotify.com/api/token';
  private accessToken: string | null = null;

  constructor(private http: HttpClient) { }

  private getAccessToken(): Observable<string> {
    if (this.accessToken) {
      return of(this.accessToken); // Devuelve el token actual si ya está definido
    } else {
      const body = new HttpParams()
        .set('grant_type', 'client_credentials')
        .set('client_id', this.clientId)
        .set('client_secret', this.clientSecret);

      const headers = new HttpHeaders({
        'Content-Type': 'application/x-www-form-urlencoded'
      });

      return this.http.post<any>(this.tokenUrl, body.toString(), { headers }).pipe(
        map(response => {
          this.accessToken = response.access_token;
          return this.accessToken as string; // Asegura a TypeScript que accessToken no es nulo
        }),
        catchError(error => {
          console.error('Error al obtener el token de acceso:', error);
          return of(''); // Manejo de error, devuelve un string vacío o maneja el error según tu caso
        })
      );
    }
  }

  searchTracks(query: string): Observable<any> {
    return this.getAccessToken().pipe(
      switchMap(token => {
        const headers = new HttpHeaders({
          'Authorization': `Bearer ${token}`
        });
        return this.http.get<any>(`${this.apiUrl}/search?q=${query}&type=track`, { headers });
      })
    );
  }
}
