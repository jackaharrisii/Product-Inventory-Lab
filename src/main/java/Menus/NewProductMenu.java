package Menus;

import io.Console;
import services.SneakerService;
import services.WhiskeyService;

import java.util.ArrayList;

public class NewProductMenu extends MainMenu{

    private String name;
    private String brand;
    private String sport;
    private float size;
    private int quantity;
    private float price;
    private SneakerService sneakerService = new SneakerService();


    public void displayMenu(){
        String header = String.format("" +
                "**************************************************\n" +
                "***              New Products Menu             ***\n" +
                "**************************************************\n");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Create a New Sneaker");
        choices.add("Create a New Whiskey");
        choices.add("Return to the Main Menu");

        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) {
            name = Console.getInput("What is the name of your new sneaker?");
            brand = Console.getInput("What is the brand of your new sneaker?");
            sport = Console.getInput("What sport is your new sneaker designed for?");
            size = Float.valueOf(Console.getInput("What size is this sneaker?"));
            quantity = Integer.valueOf(Console.getInput("How many sneakers are in stock?"));
            price = Float.valueOf(Console.getInput("What is the price for your sneaker? (numbers only, no $ sign)"));
            sneakerService.create(name, brand, sport, size, quantity, price);
            displayMenu();
        }
        else if (input == 2) {
            name = Console.getInput("What is the name of your new whiskey?");
            brand = Console.getInput("What is the brand of your new whiskey?");
            size = Float.valueOf(Console.getInput("What size is this bottle of whiskey (in Liters)?"));
            quantity = Integer.valueOf(Console.getInput("How many bottles are in stock?"));
            price = Float.valueOf(Console.getInput("What is the price for your whiskey? (numbers only, no $ sign)"));
            new WhiskeyService().create(name, brand, size, quantity, price);
            displayMenu();
        }
        else {new MainMenu().displayMenu();}
    }

}
