import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Nota } from '../model/Nota';

@Injectable({
  providedIn: 'root'
})
export class NotaService {
  private urlEndPoint: string = 'http://localhost:8082/apiNota/notas';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json',
  });

  constructor(private http: HttpClient) { }

  mostrarNotas(): Observable<Nota[]> {
    return this.http
      .get<Nota[]>(this.urlEndPoint)
      .pipe(map((response) => response as Nota[]));
  }

  mostrarNota(id: number): Observable<Nota> {
    return this.http.get<Nota>(`${this.urlEndPoint}/${id}`);
  }

  eliminarNota(id: number): Observable<void> {
    return this.http.delete<void>(`${this.urlEndPoint}/${id}`, {
      headers: this.httpHeaders
    });
  }

  crearNota(nota: Nota): Observable<Nota> {
    return this.http.post<Nota>(
      this.urlEndPoint,
      nota,
      {
        headers: this.httpHeaders
      }
    );
  }

  actualizarNota(nota: Nota): Observable<Nota> {
    return this.http.put<Nota>(
      `${this.urlEndPoint}/${nota.idNota}`,
      nota,
      {
        headers: this.httpHeaders
      }
    );
  }
}
