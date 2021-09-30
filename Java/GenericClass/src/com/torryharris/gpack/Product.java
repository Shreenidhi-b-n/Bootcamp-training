package com.torryharris.gpack;

public class Product {
    private String pname;
    private int price;

    public Product(String pname, int price) {
        this.pname = pname;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }
}
