// import { UsuarioService } from './../../services/usuario.service';
// import { Usuario } from './../../model/Usuario';
// //crear-cuenta.component.ts
// import { Component } from '@angular/core';
// import { NavbarhComponent } from '../../navbarh/navbarh.component';

// @Component({
//   selector: 'app-crear-cuenta',
//   standalone: true,
//   imports: [NavbarhComponent],
//   templateUrl: './crear-cuenta.component.html',
//   styleUrl: './crear-cuenta.component.css'
// })
// export class CrearCuentaComponent {

// }
import { Component } from '@angular/core';
import { UsuarioService } from './../../services/usuario.service';
import { Usuario } from './../../model/Usuario';
import { NavbarhComponent } from '../../navbarh/navbarh.component';
import { FormsModule } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-crear-cuenta',
  standalone: true,
  imports: [NavbarhComponent, FormsModule],
  templateUrl: './crear-cuenta.component.html',
  styleUrls: ['./crear-cuenta.component.css']
})
export class CrearCuentaComponent {
  nuevoUsuario: Usuario = new Usuario(); // Objeto para almacenar los datos del nuevo usuario

  constructor(
    private usuarioService: UsuarioService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  registrarUsuario() {
    // Llama al método crearUsuario del servicio
    this.usuarioService.crearUsuario(this.nuevoUsuario).subscribe(
      response => {
        console.log('Usuario creado exitosamente:', response);
        this.router.navigate(['/login']);
      },
      error => {
        console.error('Error al crear usuario:', error);
        // Manejo de errores, como mostrar un mensaje al usuario
      }
    );
  }
}

