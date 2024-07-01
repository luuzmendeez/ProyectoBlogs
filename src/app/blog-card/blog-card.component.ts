//blog-card.component.ts
import { Component, Input } from '@angular/core';
import { Blog } from '../model/Blog';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-blog-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './blog-card.component.html',
  styleUrl: './blog-card.component.css'
})
export class BlogCardComponent {
  @Input() imageUrl: string = '';
  @Input() title: string = '';
  @Input() description: string = '';
}
