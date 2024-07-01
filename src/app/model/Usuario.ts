//Usuario.ts
import { Blog } from './Blog';
export class Usuario {
    idUsuario!: number;
    nombreUsuario!: string;
    correo!: string;
    password!: string;
    edad!: Date;
    blogs!: Blog[];
  }
