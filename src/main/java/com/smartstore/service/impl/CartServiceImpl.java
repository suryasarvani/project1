package com.smartstore.service.impl;


import com.smartstore.dao.CartDao;
import com.smartstore.model.Cart;
import com.smartstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }

    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;
