package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class SneakerTest {

    Sneaker testSneaker;
    Sneaker otherSneaker;

    @Before
    public void setUp() throws Exception {
        testSneaker = new Sneaker(0001, "Air Gordon", "Nikee", "Baseketball", 10, 66, 66.00f);
        otherSneaker = new Sneaker();
    }

    // don't need specific constructor tests because they are covered between the setup and the getter tests

    @Test
    //test Id
    public void getIdTest(){
        Assert.assertEquals(0001,testSneaker.getId());
    }

    @Test
    //test Name
    public void getNameTest(){
        Assert.assertEquals("Air Gordon",testSneaker.getName());
    }

    @Test
    //test brand
    public void getBrandTest(){
        Assert.assertEquals("Nikee",testSneaker.getBrand());
    }

    @Test
    //test sport
    public void getSportTest(){
        Assert.assertEquals("Baseketball",testSneaker.getSport());
    }

    @Test
    //test size
    public void getSizeTest(){
        Assert.assertEquals(10,testSneaker.getSize(),.001);
    }

    @Test
    //test quantity
    public void getQtyTest(){
        Assert.assertEquals(66,testSneaker.getQty());
    }
    @Test
    //test price
    public void getPriceTest(){
        Assert.assertEquals(66,testSneaker.getPrice(),.001);
    }

    @Test
    //test Id
    public void setIdTest(){
        otherSneaker.setId(0002);
        Assert.assertEquals(0002, otherSneaker.getId());
    }

    @Test
    //test Name
    public void setNameTest(){
        otherSneaker.setName("Four Stripes");
        Assert.assertEquals("Four Stripes",otherSneaker.getName());
    }

    @Test
    //test brand
    public void setBrandTest(){
        otherSneaker.setBrand("Abidas");
        Assert.assertEquals("Abidas",otherSneaker.getBrand());
    }

    @Test
    //test sport
    public void setSportTest(){
        otherSneaker.setSport("Running?");
        Assert.assertEquals("Running?",otherSneaker.getSport());
    }

    @Test
    //test size
    public void setSizeTest(){
        otherSneaker.setSize(8);
        Assert.assertEquals(8,otherSneaker.getSize(),.001);
    }

    @Test
    //test quantity
    public void setQtyTest(){
        otherSneaker.setQty(88);
        Assert.assertEquals(88,otherSneaker.getQty());
    }
    @Test
    //test price
    public void setPriceTest(){
        otherSneaker.setPrice(20);
        Assert.assertEquals(20,otherSneaker.getPrice(),.001);
    }

}
