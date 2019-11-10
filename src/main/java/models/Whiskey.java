package models;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private float sizeInLiters;
    private int qty;
    private float price;

    public Whiskey (int id, String name, String brand, float sizeInLiters, int qty, float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sizeInLiters = sizeInLiters;
        this.qty = qty;
        this.price = price;
    }

    public Whiskey(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getSizeInLiters() {
        return sizeInLiters;
    }

    public void setSizeInLiters(float sizeInLiters) {
        this.sizeInLiters = sizeInLiters;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
