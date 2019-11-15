package Whiskey;

import Sneakers.Sneaker;
import Sneakers.SneakerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SneakerServiceTest {

    // instantiate a SneakerService object and a testSneaker
    private SneakerService sneakerService = new SneakerService();
    private Sneaker testSneaker;
    private Sneaker[] testInventoryArray;

    @Before
    public void setUp(){
    }

    @Test
    public void createTest(){
        testSneaker = sneakerService.create("Air Gordon", "Nikee",
                "Sports", 10.5f, 10, 80.00f);
        Assertions.assertEquals(1, sneakerService.getInventory().get(1).getId());
        Assertions.assertEquals("Air Gordon", sneakerService.getInventory().get(1).getName());
        Assertions.assertEquals("Nikee", sneakerService.getInventory().get(1).getBrand());
        Assertions.assertEquals("Sports", sneakerService.getInventory().get(1).getSport());
        Assertions.assertEquals(10.5f, sneakerService.getInventory().get(1).getSize());
        Assertions.assertEquals(10, sneakerService.getInventory().get(1).getQty());
        Assertions.assertEquals(80.00f, sneakerService.getInventory().get(1).getPrice());
    }

    @Test
    public void findSneakerTest(){
        testSneaker = sneakerService.create("Air Gordon", "Nikee",
                "Sports", 10.5f, 10, 80.00f);
        Assert.assertEquals(testSneaker,sneakerService.findSneaker(1));
    }

    @Test
    public void findAllTest(){
        testSneaker = sneakerService.create("Air Gordon", "Nikee",
                "Sports", 10.5f, 10, 80.00f);
        testInventoryArray = sneakerService.findAll();
        Sneaker[] expected = new Sneaker[]{testSneaker};
        Assert.assertEquals(expected, testInventoryArray);
    }

    @Test
    public void deleteTest(){
        testSneaker = sneakerService.create("Air Gordon", "Nikee",
                "Sports", 10.5f, 10, 80.00f);
        Assert.assertTrue(sneakerService.delete(1));
    }

    @Test
    public void printSneaker(){
        testSneaker = sneakerService.create("Air Gordon", "Nikee",
                "Sports", 10.5f, 10, 80.00f);
        String expected = "Name: Air Gordon, Brand: Nikee, Sport: Sports, Size: 10.5, Qty: 10, Price: $80.00\n";
        Assert.assertEquals(expected, sneakerService.printSneaker(testSneaker));
    }

}
