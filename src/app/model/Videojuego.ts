import { Coleccion } from './Coleccion';

export class Videojuego {
  idVideojuego!: number;
  nombreVideojuego!: string;
  descripcionVideojuego!: string;
  imagenVideojuego!: string | null;
  idColeccion!: Coleccion;
}