package Whiskey;

import Whiskey;

import java.util.HashMap;

public class WhiskeyService{

    private int id = 0;
    private String name;
    private String brand;
    private float size;
    private int quantity;
    private float price;

    private HashMap<Integer, Whiskey> inventory = new HashMap<>();

    // method to accept arguments and return a new instance of a Sneaker object
    public Whiskey create(String name, String brand, float size, int quantity, float price) {
        id++;
        // create a new sneaker, passing the values from above into the constructor
        Whiskey createdWhiskey = new Whiskey(id, name, brand, size, quantity, price);
        // adds the new sneaker to the HashMap to be managed
        inventory.put(createdWhiskey.getId(), createdWhiskey);
        // returns the newly created object to the caller
        return inventory.get(id);
    }

    //read
    public Whiskey findWhiskey(int id) {
        this.id = id;
        // should take an int and return an object with that id, if exists
        return inventory.get(id);
    }

    //read all
    public Whiskey[] findAll() {
        // should return a Whiskey array copy of the HashMap
        Whiskey[] whiskeyArray = new Whiskey[inventory.size()];
        for (int i = 0; i < inventory.size(); i++){
            whiskeyArray[i] = inventory.get(i+1);
        }
        return whiskeyArray;
    }

    //delete
    public boolean delete(int id) {
        if (inventory.containsKey(id)){
            inventory.remove(id);
            return true;
        }
        return false;
    }

    public String printWhiskey(Whiskey whiskey){
        return String.format("Name: %s, Brand: %s, Size: %.1f Liters, Qty: %d, Price: $%.2f\n",
                whiskey.getName(), whiskey.getBrand(), whiskey.getSize(), whiskey.getQty(), whiskey.getPrice());
    }

    public HashMap<Integer, Whiskey> getInventory() {
        return inventory;
    }

}
