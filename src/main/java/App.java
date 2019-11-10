import io.Console;
import services.SneakerService;

public class App {

    // create the services needed to manage inventory
    private SneakerService sneakerService = new SneakerService();

    public static void main(String... args){
        // instantiate the application
        App application = new App();
        // call a method to initialize the application
        application.init();
    }

    public void init(){
        // place the application logic here
        // call methods to take user input and interface with services
        //   - create different products to be added to inventory
        //   - read from existing products
        //   - update products
        //   - delete products
        //   - get different reports about products
        //   - exit the program
        Console.printWelcome();
    }

}
