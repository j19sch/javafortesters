package com.javafortesters.chap013moreaboutexceptions;

import com.javafortesters.domainentities.InvalidPasswordException;
import com.javafortesters.domainentities.UserExc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by jss on 13-2-16.
 */
public class CustomExceptionTest {

    @Test
    public void setPasswordThrowsInvalidPasswordExceptionTest() {
        UserExc user = new UserExc();
        try {
            user.setPassword("short");
            fail("An exception should have been thrown.");
        } catch(InvalidPasswordException invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void testPassesWhenExceptionNotThrown() {
        UserExc user = new UserExc();
        try {
            user.setPassword("longenough");
//            fail("An exception should have been thrown.");
        } catch(InvalidPasswordException invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void constructorThrowsInvalidPasswordExceptionTest(){
        try {
            UserExc user = new UserExc("bob", "short");
            fail("An exception should have been thrown.");
        } catch (InvalidPasswordException invalidPassword) {
            assertTrue("The exception was thrown", true);
        }

    }

    @Test
    public void defaultConstructorDoesNotThrowInvalidPasswordExceptionTest(){
        UserExc user = new UserExc();
        assertTrue("The exception was not thrown", true);
    }

    @Test
    public void InvalidPasswordExceptionMessageTextTest(){
        UserExc user = new UserExc();
        try {
            user.setPassword("short");
            fail("An exception should have been thrown.");
        } catch(InvalidPasswordException invalidPassword) {
            assertTrue("The exception was thrown", true);
            assertEquals("Password must be > 6 chars.", invalidPassword.getMessage());
        }
    }

}
