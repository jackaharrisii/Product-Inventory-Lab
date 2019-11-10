package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {

    private static int nextId = 1;

    private ArrayList<Sneaker> inventory = new ArrayList<>();

    // method to accept arguments and return a new instance of a Sneaker object
    public Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {

        // create a new sneaker, passing the values from above into the constructor
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        // adds the new sneaker to the ArrayList to be managed
        inventory.add(createdSneaker);

        // returns the newly created object to the caller
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getId() == id){
                return inventory.get(i);
            }
        }
        return null;
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        Sneaker[] sneakerArray = new Sneaker[inventory.size()];
        for (int i = 0; i < inventory.size(); i++){
            sneakerArray[i] = inventory.get(i);
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

}
