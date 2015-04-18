package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPasswordTest(){
        User user = new User();
        assertEquals("default username expected", "username", user.getUsername());
        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void userIsBob(){
        User buser = new User();
        buser.username = "bob";
        assertEquals("non-default username bob", "bob", buser.getUsername());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("Admin", "pa55w0rD");
        assertEquals("given username expected", "Admin", user.getUsername());
        assertEquals("given password expected", "pa55w0rD", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() {
        User user = new User();
        user.setPassword("PaZZwor6");
        assertEquals("set password expected", "PaZZwor6", user.getPassword());
    }
}
