package com.javafortesters.chap008selectionsdecisions;

import org.junit.Assert;
import org.junit.Test;

public class NestedIfElseHorrorTest {

    private boolean truthy = true;
    private boolean falsey = false;

    @Test
    public void soItHasComeToThis() {
        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (falsey || truthy) {
                        Assert.assertTrue("1st test", truthy == true);
                        Assert.assertTrue("2nd test", falsey == false);
                    }
                }
            } else {
                Assert.assertTrue("3rd test", truthy == true);
                Assert.assertTrue("4th test", falsey == true);
            }
        } else {
            if (!truthy) {
                if (falsey) {
                    Assert.assertTrue("5th test", falsey);
                    Assert.assertFalse("6th test", truthy);
                } else {
                    Assert.assertFalse("7th test", falsey);
                    Assert.assertFalse("8th test", truthy);
                }
            }
        }
    }
}
