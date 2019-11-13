package services;

import models.Sneaker;

import java.util.HashMap;

public class SneakerService {
    private int id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int quantity;
    private float price;

    public HashMap<Integer, Sneaker> getInventory() {
        return inventory;
    }

    private HashMap<Integer, Sneaker> inventory = new HashMap<>();

    // method to accept arguments and return a new instance of a Sneaker object
    public Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {
        id = inventory.size() +1;
        // create a new sneaker, passing the values from above into the constructor
        Sneaker createdSneaker = new Sneaker(id, name, brand, sport, size, quantity, price);
        // adds the new sneaker to the HashMap to be managed
        inventory.put(createdSneaker.getId(), createdSneaker);
        // returns the newly created object to the caller
        return inventory.get(id);
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return inventory.get(id);
    }

    //read all
    public Sneaker[] findAll() {
        // should return a Sneaker array copy of the HashMap
        Sneaker[] sneakerArray = new Sneaker[inventory.size()];
        for (int i = 0; i < inventory.size(); i++){
            sneakerArray[i] = inventory.get(i+1);
        }
        return sneakerArray;
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

    public String printSneaker(Sneaker sneaker){
        return String.format("Name: %s, Brand: %s, Sport: %s, Size: %.1f, Qty: %d, Price: $%.2f\n",
                sneaker.getName(), sneaker.getBrand(), sneaker.getSport(), sneaker.getSize(), sneaker.getQty(), sneaker.getPrice());
    }

}
