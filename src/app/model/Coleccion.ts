import { Blog } from './Blog';
import { Videojuego } from './Videojuego';

export class Coleccion {
  idColeccion!: number;
  nombreColeccion!: string;
  descripcionColeccion!: string;
  imagenColeccion?: ArrayBuffer | null; // Assuming you handle image as ArrayBuffer in Angular
  videojuegos!: Videojuego[];
  idBlog!: Blog;
}
