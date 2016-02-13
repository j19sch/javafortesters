package com.javafortesters.chap012introducinginheritance;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jss on 2-2-16.
 */
public class CompositionTest {

    @Test
    public void getUrlViaUserObject(){
        User user = new User();
        assertEquals("Url should be same as TestAppEnv", "http://192.123.0.3:67", user.getTestAppEnvUrl());
    }
}
