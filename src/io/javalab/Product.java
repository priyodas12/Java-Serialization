package io.javalab;

import java.io.Serializable;

public class Product implements Serializable {


    private static final long serialVersionUID = -7658906114781628860L;

    private int productId;
    private double price;
    private transient String mfd;

    public Product(int productId, double price, String mfd) {
        this.productId = productId;
        this.price = price;
        this.mfd = mfd;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMfd() {
        return mfd;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }
}
