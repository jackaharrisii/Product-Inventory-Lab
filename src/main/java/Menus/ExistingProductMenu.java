package Menus;

import io.Console;
import services.SneakerService;
import services.WhiskeyService;

import java.util.ArrayList;

public class ExistingProductMenu extends MainMenu{

    private String name;
    private String brand;
    private String sport;
    private float size;
    private int quantity;
    private float price;
    private int id;
    SneakerService sneakerService = new SneakerService();
    WhiskeyService whiskeyService = new WhiskeyService();


    public void displayMenu(){
        String header = String.format("" +
                "**************************************************\n" +
                "***          Existing Products Menu            ***\n" +
                "**************************************************\n");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Look up an existing Sneaker by ID number");
        choices.add("Look up an existing Whiskey by ID number");
        choices.add("Edit an existing Sneaker");
        choices.add("Edit an existing Whiskey");
        choices.add("Remove an existing Sneaker from Inventory");
        choices.add("Remove an existing Whiskey from Inventory");
        choices.add("Return to the Main Menu");

        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) {
            id = Integer.valueOf(Console.getInput("Input ID for sneaker look up:"));
            Console.print(sneakerService.printSneaker(sneakerService.findSneaker(id)));

            displayMenu();
        }
        else if (input == 2) {
            id = Integer.valueOf(Console.getInput("Input ID for whiskey look up:"));
            Console.print(whiskeyService.findWhiskey(id).toString());
            displayMenu();
        }
        else if (input == 3) {
            editSneaker();
            displayMenu();
        }
        else if (input == 4) {
            editWhiskey();
            displayMenu();
        }
        else if (input == 5) {
            id = Integer.valueOf(Console.getInput("Input ID for sneaker to remove from inventory:"));
            Console.print("The following sneaker is being removed from our inventory:\n" + sneakerService.findSneaker(id).toString());
            sneakerService.delete(id);
            displayMenu();
        }
        else if (input == 6) {
            id = Integer.valueOf(Console.getInput("Input ID for whiskey to remove from inventory:"));
            Console.print("The following whiskey is being removed from our inventory:\n" + whiskeyService.findWhiskey(id).toString());
            whiskeyService.delete(id);
            displayMenu();
        }
        else {new MainMenu().displayMenu();}
    }

    public void editSneaker(){
//        this.Sneaker = Integer.valueOf(Console.getInput("Input ID for sneaker look up:"));
//        id.setPrice
    }

    public void editWhiskey(){

    }

}
