package Menus;

import io.Console;

import java.util.ArrayList;

public class MainMenu {



//    public static void printWelcome() {
//        System.out.println("" +
//                "**************************************************\n" +
//                "***           Welcome and Bienvenue            ***\n" +
//                "***                    to                      ***\n" +
//                "***          ZipCo Inventory Manager           ***\n" +
//                "**************************************************\n");
//    }

    public void displayMenu(){
        String header = String.format("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************\n");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Create a New Product");
        choices.add("Find / Update / Delete an Existing Product");
        choices.add("Get Reports about Products");
        choices.add("Exit");

        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) { new NewProductMenu().displayMenu(); }
        else if (input == 2) {new ExistingProductMenu().displayMenu();}
        else if (input == 3) {new ReportsMenu().displayMenu();}
    }
}