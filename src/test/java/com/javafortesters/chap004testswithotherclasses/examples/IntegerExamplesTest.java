package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jss on 3/8/15.
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
        Integer six = 6;
        assertEquals("intValue returns int 6", 6, six.intValue());
    }

    @Test
    public void toHexStringTest() {
        Integer eleven = 11;
        assertEquals("11 becomes b", "b", Integer.toHexString(eleven));
        Integer ten = 10;
        assertEquals("10 becomes a", "a", Integer.toHexString(ten));
        Integer three = 3;
        assertEquals("3 becomes 3", "3", Integer.toHexString(three));
        //Integer twentyone = 21;
        assertEquals("21 becomes 15", "15", Integer.toHexString(21));
    }

    @Test
    public void integerFieldsTest() {
        assertEquals("min_val is ok", -2147483648, Integer.MIN_VALUE);
        assertEquals("max_val is ok", 2147483647, Integer.MAX_VALUE);
    }
}
