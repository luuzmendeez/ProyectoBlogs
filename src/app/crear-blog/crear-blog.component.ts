import { Component } from '@angular/core';
import { Blog } from '../model/Blog';
import { BlogService } from '../services/blog.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-crear-blog',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './crear-blog.component.html',
  styleUrl: './crear-blog.component.css'
})
export class CrearBlogComponent {
  nuevoBlog: Blog = new Blog();
  mostrarFormulario: boolean = false; // Variable para controlar la visibilidad del formulario

  constructor(private blogService: BlogService) {}

  onSubmit(): void {
    this.blogService.crearBlog(this.nuevoBlog).subscribe(
      (blogCreado) => {
        console.log('Blog creado:', blogCreado);
        this.nuevoBlog = new Blog(); 
        this.mostrarFormulario = false; 
      },
      (error) => {
        console.error('Error al crear el blog:', error);
      }
    );
  }
}
