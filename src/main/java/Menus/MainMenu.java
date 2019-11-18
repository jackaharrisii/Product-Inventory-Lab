package Menus;

import Sneakers.SneakerService;
import Whiskey.WhiskeyService;
import io.Console;

import java.util.ArrayList;

public class MainMenu {

    public SneakerService sneakerService = new SneakerService();
    public WhiskeyService whiskeyService = new WhiskeyService();

    public void displayMenu(){
        String header = String.format("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("New Product Actions");
        choices.add("Existing Product Actions");
        choices.add("Exit");

        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) { new NewProductMenu().displayMenu(); }
        else if (input == 2) {new ExistingProductMenu(sneakerService, whiskeyService).displayMenu();}
    }
}