package com.company;



public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Product 1", 100);
        Product product2 = new Product("Product 2", 200);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the shopping cart
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Print the total price of the shopping cart
        System.out.println("Total price: " + cart.getTotalPrice());
    }
}