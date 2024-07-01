// model/Blog.ts
import { Usuario } from './Usuario';
import { Coleccion } from './Coleccion';
import { Playlist } from './Playlist';
import { Nota } from './Nota';

export class Blog {
  idBlog: number = 0;
  nombreBlog: string = '';
  descripcionBlog: string = '';
  idUsuario: Usuario | null = null;
  colecciones: Coleccion[] = [];
  playlists: Playlist[] = [];
  notas: Nota[] = [];
}