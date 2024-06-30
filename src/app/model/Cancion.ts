//model/Cancion.ts
import { Playlist } from './Playlist';

export class Cancion {
  idCancion!: number;
  nombreCancion!: string;
  linkCancion!: string;
  idPlaylist!: Playlist;
}
