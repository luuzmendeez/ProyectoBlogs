// auth.service.ts (ejemplo de simulación)
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { delay } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private isAuthenticated: boolean = false;

  login(correo: string, password: string): Observable<any> {
    if (correo === 'luzmendez@gmail.com' && password === 'Hola1234') {
      this.isAuthenticated = true;
      return of({ success: true }).pipe(delay(1000));
    } else {
      return of({ success: false }).pipe(delay(1000)); 
    }
  }

  isLoggedIn(): boolean {
    return this.isAuthenticated;
  }

  logout(): void {
    this.isAuthenticated = false;
  }
}
