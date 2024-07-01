//app.routes.ts
// import { CrearCuentaComponent } from './crear-cuenta/crear-cuenta.component';
// import { Routes } from '@angular/router';
// import { NgModule } from '@angular/core';
// import { provideHttpClient } from '@angular/common/http';
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
// // import { PlaylistComponent } from './playlist/playlist.component';


// export const routes: Routes = [
//     {path: 'header', component: HeaderComponent},
//     {path: 'navbarh', component: NavbarhComponent},
//     { path: '', redirectTo: '/home', pathMatch: 'full' },
//     {path: 'landing', component: LandingComponent},
//     {path: 'home', component: HomeComponent},
//     {path: 'blog-card', component: BlogCardComponent},
//     {path: 'login', component: LoginComponent},
//     {path: 'crear-cuenta', component: CrearCuentaComponent},
//     {path: 'boton', component: BotonComponent},
//     { path: 'videojuegos', component: VideojuegosComponent },
//     { path: 'notas', component: NotasComponent },
//     { path: '**', redirectTo: 'playlists' },
//     { path: 'item', component: ItemCardComponent },
//     // { path: 'playlists', component: PlaylistComponent },

// ];



// export const AppRoutes = routes;


import { Routes } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './auth/login/login.component';
import { CrearCuentaComponent } from './auth/crear-cuenta/crear-cuenta.component';

export const routes: Routes = [
  { path: '', redirectTo: '/landing', pathMatch: 'full' },
  { path: 'landing', component: LandingComponent },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'crear-cuenta', component: CrearCuentaComponent },
];

export const AppRoutes = routes;


