package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class WhiskeyServiceTest {


    // instantiate a SneakerService object
    WhiskeyService whiskeyService = new WhiskeyService();
    private ArrayList<Whiskey> testInventory = new ArrayList<>();
    private Whiskey[] testInventoryArray;
    Whiskey testWhiskey;
    String expectedName;
    String expectedBrand;
    float expectedSizeInLiters;
    int expectedQty;
    float expectedPrice;

    @Before
    public void setUp(){
        // establish test data
        expectedName = "Lightning Bolt";
        expectedBrand = "Lightning Bolt Cinnamon Whiskey";
        expectedSizeInLiters = 0.5f;
        expectedQty = 10;
        expectedPrice = 20.00f;

        // then use whiskeyService to create and return a new Whiskey object
        testWhiskey = whiskeyService.create(expectedName, expectedBrand, expectedSizeInLiters, expectedQty, expectedPrice);
    }

    @Test
    public void createTest(){
        // use accessor methods to capture data from the newly created sneaker
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        float actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        // check/assert that the data passed into the SneakerService was properly assigned to the new Sneaker object returned
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSizeInLiters, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findSneakerTest(){
        Whiskey foundWhiskey = null;
        testInventory.add(testWhiskey);
        for (int i = 0; i < testInventory.size(); i++){
            if (testInventory.get(i).getId() == testWhiskey.getId()){
                foundWhiskey = testWhiskey;
            }
        }
        Assert.assertEquals(testWhiskey,foundWhiskey);
    }

    @Test
    public void findAllTest(){
        testInventory.add(testWhiskey);
        testInventoryArray = whiskeyService.findAll();
        Assert.assertEquals(testInventoryArray, testInventory.toArray());
    }

    @Test
    public void deleteTest(){
        testInventory.add(testWhiskey);
        Assert.assertTrue(whiskeyService.delete(testWhiskey.getId()));
    }

    @Test
    public void printWhiskey() {
        String expected = "Name: Lightning Bolt, Brand: Lightning Bolt Cinnamon Whiskey, Size: 0.5 Liters, Qty: 10, Price: $20.00\n";
        Assert.assertEquals(expected, whiskeyService.printWhiskey(testWhiskey));
    }
}
