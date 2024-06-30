import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Coleccion } from '../model/Coleccion';

@Injectable({
  providedIn: 'root'
})
export class ColeccionService {
  private urlEndPoint: string = 'http://localhost:8082/apiColeccion/colecciones';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json',
  });

  constructor(private http: HttpClient) { }

  mostrarColecciones(): Observable<Coleccion[]> {
    return this.http
      .get<Coleccion[]>(this.urlEndPoint)
      .pipe(map((response) => response as Coleccion[]));
  }

  mostrarColeccion(id: number): Observable<Coleccion> {
    return this.http.get<Coleccion>(`${this.urlEndPoint}/${id}`);
  }

  eliminarColeccion(id: number): Observable<void> {
    return this.http.delete<void>(`${this.urlEndPoint}/${id}`, {
      headers: this.httpHeaders
    });
  }

  crearColeccion(coleccion: Coleccion): Observable<Coleccion> {
    return this.http.post<Coleccion>(
      this.urlEndPoint,
      coleccion,
      {
        headers: this.httpHeaders
      }
    );
  }

  actualizarColeccion(coleccion: Coleccion): Observable<Coleccion> {
    return this.http.put<Coleccion>(
      `${this.urlEndPoint}/${coleccion.idColeccion}`,
      coleccion,
      {
        headers: this.httpHeaders
      }
    );
  }
}
