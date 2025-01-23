import { Component } from '@angular/core';
import { CartService } from '../../services/cart.service';

@Component({
  selector: 'app-cart-status',
  standalone: false,

  templateUrl: './cart-status.component.html',
  styleUrl: './cart-status.component.css',
})
export class CartStatusComponent {
  totalPrice: number = 0.0;
  totalQuantity: number = 0;
  USD: string | undefined;

  constructor(private cartService: CartService) {}

  ngOnInit(): void {
    this.updateCartStatus();
  }
  updateCartStatus() {
    // subscribe to the cart event totalPrice
    this.cartService.totalPrice.subscribe((data) => {
      this.totalPrice = data;
    });

    // subscribe to the cart event totalQuantity
    this.cartService.totalQuantity.subscribe((data) => {
      this.totalQuantity = data;
    });
  }
}
