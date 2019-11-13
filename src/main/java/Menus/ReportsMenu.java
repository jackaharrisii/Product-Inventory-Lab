package Menus;

import io.Console;
import models.Sneaker;
import services.SneakerService;
import services.WhiskeyService;

import java.util.ArrayList;

public class ReportsMenu extends MainMenu{

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
                "***                Reports Menu                ***\n" +
                "**************************************************\n");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Print a report of all sneakers");
        choices.add("Print a report of all whiskey");
        choices.add("Return to Main Menu");
        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) {
            Sneaker[] sneakerInventory = sneakerService.findAll();
            for (int i = 0; i < sneakerInventory.length; i++){
                Console.print(sneakerService.printSneaker(sneakerService.findSneaker(i)));
            }
            Console.getInput("\nPress Return to return to the Reports Menu");
            displayMenu();
        }
        else if (input == 2) {
            Console.print(whiskeyService.findAll().toString());
            Console.getInput("\nPress Return to return to the Reports Menu");
            displayMenu();
        }
        else {new MainMenu().displayMenu();}
    }

}
