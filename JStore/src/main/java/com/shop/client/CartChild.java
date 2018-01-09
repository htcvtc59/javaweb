/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.client;

import com.shop.admin.dto.ProductAdmin;

/**
 *
 * @author MacOS
 */
public class CartChild {

    private ProductAdmin product;
    private int quantity;

    public CartChild() {

    }

    public CartChild(ProductAdmin product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductAdmin getProduct() {
        return product;
    }

    public void setProduct(ProductAdmin product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
