package services;

import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService{

    private static int nextId = 1;
    private String name;
    private String brand;
    private float size;
    private int quantity;
    private float price;

    private ArrayList<Whiskey> inventory = new ArrayList<>();

    // method to accept arguments and return a new instance of a Sneaker object
    public Whiskey create(String name, String brand, float size, int quantity, float price) {

        // create a new sneaker, passing the values from above into the constructor
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, size, quantity, price);

        // adds the new sneaker to the ArrayList to be managed
        inventory.add(createdWhiskey);

        // returns the newly created object to the caller
        return createdWhiskey;
    }

    //read
    public Whiskey findWhiskey(int id) {
        // should take an int and return an object with that id, if exists
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getId() == id){
                return inventory.get(i);
            }
        }
        return null;
    }

    //read all
    public Whiskey[] findAll() {
        // should return a basic array copy of the ArrayList
        Whiskey[] whiskeyArray = new Whiskey[inventory.size()];
        for (int i = 0; i < inventory.size(); i++){
            whiskeyArray[i] = inventory.get(i);
        }
        return whiskeyArray;
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exists and return true.
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getId() == id ) {inventory.remove(i);
                return true;
            }
        }
        // Otherwise return false
        return false;
    }

    public String printWhiskey(Whiskey whiskey){
        return String.format("Name: %s, Brand: %s, Size: %.1f Liters, Qty: %d, Price: $%.2f\n",
                whiskey.getName(), whiskey.getBrand(), whiskey.getSize(), whiskey.getQty(), whiskey.getPrice());
    }

}
