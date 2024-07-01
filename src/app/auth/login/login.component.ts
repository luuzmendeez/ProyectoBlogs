import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { NavbarhComponent } from '../../navbarh/navbarh.component';
import { FormsModule } from '@angular/forms';
// import { InputTextModule } from 'primeng/inputtext';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [NavbarhComponent,  FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  constructor() {
    console.log('LoginComponent loaded');
  }
  // correo: string = '';
  // password: string = '';

  // constructor(private authService: AuthService, private router: Router) { }

  // onSubmit(): void {
  //   this.authService.login(this.username, this.password).subscribe(response => {
  //     if (response.success) {
  //       this.router.navigate(['/']); // Navega a la página principal después del inicio de sesión exitoso
  //     } else {
  //       alert('Usuario o contraseña incorrectos');
  //     }
  //   });
  // }
}
