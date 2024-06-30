//services/cancion.service

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Cancion } from '../model/Cancion';

@Injectable({
  providedIn: 'root'
})
export class CancionService {
  private urlEndPoint: string = 'http://localhost:8082/apiCancion/canciones';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json',
  });

  constructor(private http: HttpClient) { }

  mostrarCanciones(): Observable<Cancion[]> {
    return this.http
      .get<Cancion[]>(this.urlEndPoint)
      .pipe(map((response) => response as Cancion[]));
  }

  mostrarCancion(id: number): Observable<Cancion> {
    return this.http.get<Cancion>(`${this.urlEndPoint}/${id}`);
  }

  eliminarCancion(id: number): Observable<void> {
    return this.http.delete<void>(`${this.urlEndPoint}/${id}`, {
      headers: this.httpHeaders
    });
  }

  crearCancion(cancion: Cancion): Observable<Cancion> {
    return this.http.post<Cancion>(
      this.urlEndPoint,
      cancion,
      {
        headers: this.httpHeaders
      }
    );
  }

  actualizarCancion(cancion: Cancion): Observable<Cancion> {
    return this.http.put<Cancion>(
      `${this.urlEndPoint}/${cancion.idCancion}`,
      cancion,
      {
        headers: this.httpHeaders
      }
    );
  }
}
