// service/blog.service.ts
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Blog } from '../model/Blog';

@Injectable({
  providedIn: 'root'
})
export class BlogService {
  private urlEndPoint: string = 'http://localhost:8082/apiBlog/blogs';
  private httpHeaders = new HttpHeaders({
    'Content-Type': 'application/json'
  });

  constructor(private http: HttpClient) { }

  mostrarBlogs(): Observable<Blog[]> {
    return this.http.get(this.urlEndPoint).pipe(
      map(response => response as Blog[])
    );
  }

  mostrarBlog(id: number): Observable<Blog> {
    return this.http.get<Blog>(`${this.urlEndPoint}/${id}`);
  }

  crearBlog(blog: Blog): Observable<Blog> {
    return this.http.post<Blog>(this.urlEndPoint, blog, { headers: this.httpHeaders });
  }

  actualizarBlog(blog: Blog): Observable<Blog> {
    return this.http.put<Blog>(`${this.urlEndPoint}/${blog.idBlog}`, blog, { headers: this.httpHeaders });
  }

  eliminarBlog(id: number): Observable<Blog> {
    return this.http.delete<Blog>(`${this.urlEndPoint}/${id}`, { headers: this.httpHeaders });
  }
}
