package com.javafortesters.chap010introducingcollections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jss on 31-1-16.
 */
public class ForInsteadOfWhileTest {

    String[] someDays = {"Tuesday","Thursday",
            "Wednesday","Monday",
            "Saturday","Sunday",
            "Friday"};

    List<String> days = Arrays.asList(someDays);

    @Test
    public void whileLoop(){
        int count=0;
        while(!days.get(count).equals("Monday") ){
            count++;
        }
        assertEquals("Monday is at position 3", 3, count);
    }

    @Test
    public void forLoop(){
        int count;
        for (count=0; !days.get(count).equals("Monday"); count++) {
        }
        assertEquals("Monday is at position 3", 3, count);
    }

}
