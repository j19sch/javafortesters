package com.javafortesters.chap008selectionsdecisions;

import org.junit.Assert;
import org.junit.Test;

public class SwitchOnShortCodeTest {

    @Test
    public void checkShortCode(){
        Assert.assertEquals("UK", "United Kingdom", shortCodeSwitch("UK"));
        Assert.assertEquals("uk", "United Kingdom", shortCodeSwitch("uk"));
        Assert.assertEquals("US", "United States", shortCodeSwitch("US"));
        Assert.assertEquals("usa", "United States", shortCodeSwitch("usa"));
        Assert.assertEquals("Fr", "France", shortCodeSwitch("Fr"));
        Assert.assertEquals("SE", "Sweden", shortCodeSwitch("SE"));
        Assert.assertEquals("BE", "Rest of world", shortCodeSwitch("BE"));


    }


    public String shortCodeSwitch(String code){
        String countryName;
        switch (code.toLowerCase()){
            case "uk":
                countryName = "United Kingdom";
                break;
            case "us":
            case "usa":
                countryName = "United States";
                break;
            case "fr":
                countryName = "France";
                break;
            case "se":
                countryName = "Sweden";
                break;
            default:
                countryName = "Rest of world";

        }
        return countryName;
    }
}
