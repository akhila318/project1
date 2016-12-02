package com.fashionworld.service;

import com.fashionworld.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
