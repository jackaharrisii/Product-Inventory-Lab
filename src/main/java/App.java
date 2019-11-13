import Menus.MainMenu;

public class App {

    // create the services needed to manage inventory
//    private SneakerService sneakerService = new SneakerService();
//    private MainMenu mainMenu = new MainMenu();

    public static void main(String...args){
        // instantiate the application
//        App application = new App();
        // call a method to initialize the application
        new MainMenu().displayMenu();

//        application.init();
    }

//    public void init(){
//        // place the application logic here
//        // call methods to take user input and interface with services
//        new MainMenu().displayMenu();
//    }

}
