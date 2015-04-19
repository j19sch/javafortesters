package com.javafortesters.chap008selectionsdecisions;

import org.junit.Assert;
import org.junit.Test;

public class AssertTrue {

    private boolean truthy=true;

    @Test
    public void assertObvious(){
        if (truthy == true) Assert.assertTrue("1st nok", truthy);
        if (truthy == true) {
            Assert.assertTrue("2nd nok", truthy);
            Assert.assertFalse("3rd nok", !truthy);
        }

        if (truthy == true) Assert.assertTrue("4rd nok", truthy); else Assert.assertFalse("5th nok", truthy);

        if (truthy == true) {
            Assert.assertTrue("6th nok", truthy);
            Assert.assertFalse("7th nok",!truthy);
        } else {
            Assert.assertFalse("8th nok", truthy);
        }

    }
}
