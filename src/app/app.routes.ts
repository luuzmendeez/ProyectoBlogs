import { Routes } from '@angular/router';
import { LandingComponent } from './landing/landing.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './auth/login/login.component';
import { CrearCuentaComponent } from './auth/crear-cuenta/crear-cuenta.component';
import { BlogDetalladoComponent } from './blog-detallado/blog-detallado.component';

export const routes: Routes = [
  { path: '', redirectTo: '/landing', pathMatch: 'full' },
  { path: 'landing', component: LandingComponent },
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'crear-cuenta', component: CrearCuentaComponent },
  {path: 'blog-detallado', component: BlogDetalladoComponent}
];

export const AppRoutes = routes;


