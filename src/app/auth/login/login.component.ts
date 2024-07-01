//login.component.ts
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { Usuario } from './../../model/Usuario';
import { UsuarioService } from './../../services/usuario.service';
import { NavbarhComponent } from '../../navbarh/navbarh.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [NavbarhComponent,  FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  nuevoUsuario: Usuario = new Usuario();

  constructor(
    private authService: AuthService,
    private router: Router
  ) {}

  onSubmit(): void {
    this.authService.login(this.nuevoUsuario.correo, this.nuevoUsuario.password).subscribe(
      (response) => {
        if (response.success) {
          this.router.navigate(['/']); // Navega a la página principal después del inicio de sesión exitoso
        } else {
          alert('Usuario o contraseña incorrectos');
        }
      },
      (error) => {
        console.error('Error al iniciar sesión:', error);
        alert('Error al iniciar sesión. Por favor, intenta nuevamente más tarde.');
      }
    );
  }
}