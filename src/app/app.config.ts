//app.config.ts
// import { BlogService } from './services/blog.service';
// import { ApplicationConfig, importProvidersFrom } from '@angular/core';
// import { provideRouter } from '@angular/router';
// import { AppRoutes} from './app.routes';
// import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
// import { HttpClientModule } from '@angular/common/http';
// import { UsuarioService } from './services/usuario.service';
// import { PlaylistService } from './services/playlist.service';
// import { SpotifyService } from './services/spotify.service';
// import { ColeccionService } from './services/coleccion.service';
// import { NotaService } from './services/nota.service';
// import { Cancion } from './model/Cancion';
// import { CancionService } from './services/cancion.service';
// import { VideojuegoService } from './services/videojuego.service';
// import { FormsModule } from '@angular/forms';


// //  importProvidersFrom(HttpClientModule)
// export const appConfig: ApplicationConfig = {
//   providers: [
//     provideRouter(AppRoutes),
//     provideAnimationsAsync('noop'),
//     importProvidersFrom(HttpClientModule, FormsModule),
//     UsuarioService,
//     BlogService,
//     PlaylistService,
//     SpotifyService,
//     ColeccionService,
//     NotaService,
//     CancionService,
//     VideojuegoService]
// };


import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';
import { AppRoutes } from './app.routes';
import { provideHttpClient } from '@angular/common/http';

export const appConfig: ApplicationConfig = {
  providers: [
    provideRouter(AppRoutes),
    provideHttpClient(),
  ]
};
