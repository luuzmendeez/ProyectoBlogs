import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-item-card',
  templateUrl: './item-card.component.html',
  styleUrls: ['./item-card.component.css'],
  standalone: true,
})
export class ItemCardComponent {
  @Input() imageSrc: string = '';
  @Input() title: string = '';
  @Input() description: string = '';
  @Output() itemClicked = new EventEmitter<void>();

  onClick() {
    this.itemClicked.emit();
  }
}
