import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { tap, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  // private authUrl = 'http://your-api-url.com/auth'; // URL de tu API de autenticación
  // private loggedIn = false;

  // constructor(private http: HttpClient) {}

  // login(correo: string, password: string): Observable<any> {
  //   return this.http.post<any>(`${this.authUrl}/login`, { correo, password }).pipe(
  //     tap(response => this.loggedIn = true),
  //     catchError(this.handleError<any>('login'))
  //   );
  // }

  // logout(): void {
  //   this.loggedIn = false;
  // }

  // isLoggedIn(): boolean {
  //   return this.loggedIn;
  // }

  // private handleError<T>(operation = 'operation', result?: T) {
  //   return (error: any): Observable<T> => {
  //     console.error(error);
  //     return of(result as T);
  //   };
  // }
}
