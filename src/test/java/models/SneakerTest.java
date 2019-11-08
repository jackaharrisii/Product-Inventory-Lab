package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class SneakerTest {

    Sneaker testSneaker;

    @Before
    public void setUp() throws Exception {
        testSneaker = new Sneaker();
        testSneaker.setId(0001);
        testSneaker.setName("Air Gordon");
        testSneaker.setBrand("Nikee");
        testSneaker.setSport("Baseketball");
        testSneaker.setSize(10);
        testSneaker.setQty(66);
        testSneaker.setPrice(66);
    }

    @Test
    //test Id
    public void setIdTest(){
        Assert.assertEquals(0001,testSneaker.getId());
    }

    @Test
    //test Name
    public void setNameTest(){
        Assert.assertEquals("Air Gordon",testSneaker.getName());
    }

    @Test
    //test brand
    public void setBrandTest(){
        Assert.assertEquals("Nikee",testSneaker.getBrand());
    }

    @Test
    //test sport
    public void setSportTest(){
        Assert.assertEquals("Baseketball",testSneaker.getSport());
    }

    @Test
    //test size
    public void setSizeTest(){
        Assert.assertEquals(10,testSneaker.getSize(),.001);
    }

    @Test
    //test quantity
    public void setQtyTest(){
        Assert.assertEquals(66,testSneaker.getQty());
    }
    @Test
    //test price
    public void setPriceTest(){
        Assert.assertEquals(66,testSneaker.getPrice(),.001);
    }

}
