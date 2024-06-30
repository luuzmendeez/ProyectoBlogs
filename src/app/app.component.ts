//app.components.ts
// import { CrearCuentaComponent } from './crear-cuenta/crear-cuenta.component';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { NavbarhComponent } from './navbarh/navbarh.component';
import { LandingComponent } from './landing/landing.component';
import { HomeComponent } from './home/home.component';
import { BlogCardComponent } from './blog-card/blog-card.component';
import { LoginComponent } from './auth/login/login.component';
import { CrearCuentaComponent } from './auth/crear-cuenta/crear-cuenta.component';
import { BotonComponent } from './boton/boton.component';
import { VideojuegosComponent } from './videojuegos/videojuegos.component';
import { NotasComponent } from './notas/notas.component';
import { ItemCardComponent } from './shared/item-card/item-card.component';
import { HttpClientModule } from '@angular/common/http';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderComponent, NavbarhComponent, LandingComponent,
            HomeComponent, BlogCardComponent, LoginComponent, CrearCuentaComponent,
          BotonComponent,  VideojuegosComponent, NotasComponent, 
          ItemCardComponent, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ProyectoBlogs';
}


