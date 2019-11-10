package services;

import models.Sneaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class SneakerServiceTest {

    // instantiate a SneakerService object
    SneakerService sneakerService = new SneakerService();
    private ArrayList<Sneaker> testInventory = new ArrayList<>();
    private Sneaker[] testInventoryArray;
    Sneaker testSneaker;
    String expectedName;
    String expectedBrand;
    String expectedSport;
    float expectedSize;
    int expectedQty;
    float expectedPrice;

    @Before
    public void setUp(){
        // establish test data
        expectedName = "Stan Smith";
        expectedBrand = "Adidas";
        expectedSport = "Tennis";
        expectedSize = 10.5f;
        expectedQty = 10;
        expectedPrice = 80.00f;

        // then use sneakerService to create and return a new Sneaker object
        testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);
    }

    @Test
    public void createTest(){
        // use accessor methods to capture data from the newly created sneaker
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        float actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // check/assert that the data passed into the SneakerService was properly assigned to the new Sneaker object returned
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void findSneakerTest(){
        Sneaker foundSneaker = null;
        testInventory.add(testSneaker);
        for (int i = 0; i < testInventory.size(); i++){
            if (testInventory.get(i).getId() == testSneaker.getId()){
                foundSneaker = testSneaker;
            }
        }
        Assert.assertEquals(testSneaker,foundSneaker);
    }

    @Test
    public void findAllTest(){
        testInventory.add(testSneaker);
        testInventoryArray = sneakerService.findAll();
        Assert.assertEquals(testInventoryArray, testInventory.toArray());
    }

    @Test
    public void deleteTest(){
        testInventory.add(testSneaker);
        Assert.assertTrue(sneakerService.delete(testSneaker.getId()));
    }

}
