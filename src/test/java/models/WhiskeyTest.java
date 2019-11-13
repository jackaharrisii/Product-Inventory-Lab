package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiskeyTest {

    Whiskey testWhiskey;
    Whiskey otherWhiskey;

    @Before
    public void setUp() throws Exception {
        testWhiskey = new Whiskey(0001, "Gentleman John", "John Daniels", 1.0f, 66, 66.00f);
        otherWhiskey = new Whiskey();
    }


    @Test
    public void getIdTest() {
        Assert.assertEquals(0001, testWhiskey.getId());
    }

    @Test
    public void setIdTest() {
        otherWhiskey.setId(0002);
        Assert.assertEquals(0002, otherWhiskey.getId());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Gentleman John", testWhiskey.getName());
    }

    @Test
    public void setNameTest() {
        otherWhiskey.setName("Alaskan Club");
        Assert.assertEquals("Alaskan Club", otherWhiskey.getName());
    }

    @Test
    public void getBrandTest() {
        Assert.assertEquals("John Daniels", testWhiskey.getBrand());
    }

    @Test
    public void setBrandTest() {
        otherWhiskey.setBrand("Alaskan Spirit Co");
        Assert.assertEquals("Alaskan Spirit Co", otherWhiskey.getBrand());
    }

    @Test
    public void getSizeInLitersTest() {
        Assert.assertEquals(1f, testWhiskey.getSize(), 0.001);
    }

    @Test
    public void setSizeInLitersTest() {
        otherWhiskey.setSize(3);
        Assert.assertEquals(3, otherWhiskey.getSize(),0.001);
    }

    @Test
    public void getQtyTest() {
        Assert.assertEquals(66,testWhiskey.getQty());
    }

    @Test
    public void setQtyTest() {
        otherWhiskey.setQty(100);
        Assert.assertEquals(100,otherWhiskey.getQty());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals(66.00,testWhiskey.getPrice(),0.001);
    }

    @Test
    public void setPriceTest() {
        otherWhiskey.setPrice(10.00f);
        Assert.assertEquals(10.00,otherWhiskey.getPrice(),0.001);
    }
}
