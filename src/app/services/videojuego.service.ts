import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Videojuego } from '../model/Videojuego';

@Injectable({
  providedIn: 'root'
})
export class VideojuegoService {
  private urlEndPoint: string = 'http://localhost:8082/apiVideojuego/videojuegos';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json',
  });

  constructor(private http: HttpClient) { }

  mostrarVideojuegos(): Observable<Videojuego[]> {
    return this.http
      .get<Videojuego[]>(this.urlEndPoint)
      .pipe(map((response) => response as Videojuego[]));
  }

  mostrarVideojuego(id: number): Observable<Videojuego> {
    return this.http.get<Videojuego>(`${this.urlEndPoint}/${id}`);
  }

  eliminarVideojuego(id: number): Observable<void> {
    return this.http.delete<void>(`${this.urlEndPoint}/${id}`, {
      headers: this.httpHeaders
    });
  }

  crearVideojuego(videojuego: Videojuego): Observable<Videojuego> {
    return this.http.post<Videojuego>(
      this.urlEndPoint,
      videojuego,
      {
        headers: this.httpHeaders
      }
    );
  }

  actualizarVideojuego(videojuego: Videojuego): Observable<Videojuego> {
    return this.http.put<Videojuego>(
      `${this.urlEndPoint}/${videojuego.idVideojuego}`,
      videojuego,
      {
        headers: this.httpHeaders
      }
    );
  }
}
