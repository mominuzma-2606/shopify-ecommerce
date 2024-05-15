package com.vinay.service;

import com.vinay.exception.ProductException;
import com.vinay.modal.Cart;
import com.vinay.modal.CartItem;
import com.vinay.modal.User;
import com.vinay.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
