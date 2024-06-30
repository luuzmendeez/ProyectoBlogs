// model/Blog.ts
export class Blog {
    idBlog: number = 0;
    nombreBlog: string = '';
    descripcionBlog: string = '';
    idUsuario: any = null; // Puedes definir una clase para Usuario si tienes el modelo disponible
    colecciones: any[] = []; // Puedes definir una clase para Coleccion si tienes el modelo disponible
    playlists: any[] = []; // Puedes definir una clase para Playlist si tienes el modelo disponible
    notas: any[] = []; // Puedes definir una clase para Nota si tienes el modelo disponible
  }
  