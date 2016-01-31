package com.javafortesters.chap008selectionsdecisions;


import org.junit.Assert;
import org.junit.Test;

public class CatOrCatsTest {

    @Test
    public void checkNumberOfCats(){
        int numberOfCats = 0;
        Assert.assertEquals("0 cat",
                "cats",
                numberOfCats == 1 ? "cat" : "cats");
        Assert.assertEquals("0 cat more", "cats", returnCatCats(numberOfCats));

        numberOfCats = 1;
        Assert.assertEquals("1 cat",
                "cat",
                numberOfCats == 1 ? "cat" : "cats");
        Assert.assertEquals("1 cat more", "cat", returnCatCats(numberOfCats));


        numberOfCats = 2;
        Assert.assertEquals("2 cats",
                "cats",
                numberOfCats == 1 ? "cat" : "cats");
        Assert.assertEquals("2 cats more", "cats", returnCatCats(numberOfCats));
    }

    public String returnCatCats(int count){
        return count == 1 ? "cat" : "cats";
    }

}
