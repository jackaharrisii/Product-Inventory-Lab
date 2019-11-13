package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WhiskeyServiceTest {

    // instantiate a WhiskeyService object
    private WhiskeyService whiskeyService = new WhiskeyService();
    private Whiskey testWhiskey;
    private Whiskey[] testInventoryArray;

    @Before
    public void setUp(){
    }

    @Test
    public void createTest(){
        testWhiskey = whiskeyService.create("Lightning Bolt", "Lightning Bolt Cinnamon Whiskey", 0.5f, 10, 20f);
        // use accessor methods to capture data from the newly created sneaker
        int actualId = whiskeyService.getInventory().get(1).getId();
        String actualName = whiskeyService.getInventory().get(1).getName();
        String actualBrand = whiskeyService.getInventory().get(1).getBrand();
        float actualSize = whiskeyService.getInventory().get(1).getSize();
        int actualQty = whiskeyService.getInventory().get(1).getQty();
        float actualPrice = whiskeyService.getInventory().get(1).getPrice();

        // check/assert that the data passed into the SneakerService was properly assigned to the new Sneaker object returned
        Assertions.assertEquals(1, actualId);
        Assertions.assertEquals("Lightning Bolt", actualName);
        Assertions.assertEquals("Lightning Bolt Cinnamon Whiskey", actualBrand);
        Assertions.assertEquals(0.5f, actualSize);
        Assertions.assertEquals(10, actualQty);
        Assertions.assertEquals(20f, actualPrice);
    }

    @Test
    public void findWhiskeyTest(){
        testWhiskey = whiskeyService.create("Lightning Bolt", "Lightning Bolt Cinnamon Whiskey", 0.5f, 10, 20f);
        Assert.assertEquals(testWhiskey, whiskeyService.findWhiskey(1));
    }

    @Test
    public void findAllTest(){
        testWhiskey = whiskeyService.create("Lightning Bolt", "Lightning Bolt Cinnamon Whiskey", 0.5f, 10, 20f);
        testInventoryArray = whiskeyService.findAll();
        Whiskey[] expected = new Whiskey[]{testWhiskey};
        Assert.assertEquals(expected, testInventoryArray);
    }

    @Test
    public void deleteTest(){
        testWhiskey = whiskeyService.create("Lightning Bolt", "Lightning Bolt Cinnamon Whiskey", 0.5f, 10, 20f);
        Assert.assertTrue(whiskeyService.delete(1));
    }

    @Test
    public void printWhiskey() {
        testWhiskey = whiskeyService.create("Lightning Bolt", "Lightning Bolt Cinnamon Whiskey", 0.5f, 10, 20f);
        String expected = "Name: Lightning Bolt, Brand: Lightning Bolt Cinnamon Whiskey, Size: 0.5 Liters, Qty: 10, Price: $20.00\n";
        Assert.assertEquals(expected, whiskeyService.printWhiskey(testWhiskey));
    }
}
