//Playlist.ts en la carpeta model
import { Blog } from './Blog';
import { Cancion } from './Cancion';

export class Playlist {
  idPlaylist!: number;
  nombrePlaylist!: string;
  canciones!: Cancion[];
  idBlog!: Blog;
  image?: string;
}