package com.javafortesters.chap008selectionsdecisions;

import org.junit.Assert;
import org.junit.Test;

public class SwitchOnIntTest {

    @Test
    public void checkSwitchOnInt(){
        Assert.assertEquals("1", "one",switchOnInt(1));
        Assert.assertEquals("2", "two",switchOnInt(2));
        Assert.assertEquals("3", "three",switchOnInt(3));
        Assert.assertEquals("4", "four",switchOnInt(4));
        Assert.assertEquals("5", "Too big",switchOnInt(5));
        Assert.assertEquals("0", "Too small",switchOnInt(0));

        Assert.assertEquals("1 too", "one",switchOnInt2(1));
        Assert.assertEquals("2 too", "two",switchOnInt2(2));
        Assert.assertEquals("3 too", "three",switchOnInt2(3));
        Assert.assertEquals("4 too", "four",switchOnInt2(4));
        Assert.assertEquals("5 too", "Too big",switchOnInt2(5));
        Assert.assertEquals("0 too", "Too small",switchOnInt2(0));

    }


    private String switchOnInt2(int number){
        switch(number){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            default:
                if (number > 4) return "Too big";
                if (number < 1) return "Too small";
        }
        return "Edge case";
    }

    private String switchOnInt(int number){
        String answer = "";
        switch(number){
            case 1:
                answer = "one";
                break;
            case 2:
                answer = "two";
                break;
            case 3:
                answer = "three";
                break;
            case 4:
                answer = "four";
                break;
            default:
                if (number > 4) answer = "Too big";
                if (number < 1) answer = "Too small";
        }
        return answer;
    }
}
