//app.components.ts
// import { CrearCuentaComponent } from './crear-cuenta/crear-cuenta.component';
// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { RouterOutlet } from '@angular/router';
// import { HeaderComponent } from './header/header.component';
// import { NavbarhComponent } from './navbarh/navbarh.component';
// import { LandingComponent } from './landing/landing.component';
// import { HomeComponent } from './home/home.component';
// import { BlogCardComponent } from './blog-card/blog-card.component';
// import { LoginComponent } from './auth/login/login.component';
// import { CrearCuentaComponent } from './auth/crear-cuenta/crear-cuenta.component';
// import { BotonComponent } from './boton/boton.component';
// import { VideojuegosComponent } from './videojuegos/videojuegos.component';
// import { NotasComponent } from './notas/notas.component';
// import { ItemCardComponent } from './shared/item-card/item-card.component';
// import { HttpClientModule } from '@angular/common/http';
// import { FormsModule } from '@angular/forms';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [
//     CommonModule,
//     RouterOutlet,
//     HeaderComponent,
//     NavbarhComponent,
//     LandingComponent,
//     HomeComponent,
//     BlogCardComponent,
//     LoginComponent,
//     CrearCuentaComponent,
//     BotonComponent,
//     VideojuegosComponent,
//     NotasComponent,
//     ItemCardComponent,
//     HttpClientModule,
//     FormsModule
//   ],
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'ProyectoBlogs';
// }

// import { Component } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
// import { CommonModule } from '@angular/common';
// import { LandingComponent } from './landing/landing.component';
// import { HomeComponent } from './home/home.component';
// import { LoginComponent } from './auth/login/login.component';
// import { CrearCuentaComponent } from './auth/crear-cuenta/crear-cuenta.component';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [CommonModule, RouterOutlet, LandingComponent, HomeComponent,LoginComponent, CrearCuentaComponent],
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'ProyectoBlogs';
// }

import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { LandingComponent } from './landing/landing.component';
import { BlogCardComponent } from './blog-card/blog-card.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule,RouterOutlet, LandingComponent, RouterModule,
    BlogCardComponent
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ProyectoBlogs';
}


