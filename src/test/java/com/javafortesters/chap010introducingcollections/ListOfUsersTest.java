package com.javafortesters.chap010introducingcollections;

import com.javafortesters.domainentities.User;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jss on 31-1-16.
 */
public class ListOfUsersTest {

    @Test
    public void createAndManipulateListOfUsers(){
        List<User> users = new ArrayList<>();
        User user01 = new User();
        User user02 = new User();

        assertTrue("users is empty", users.isEmpty());

        users.add(user01);

        assertEquals("user01 has position 0", 0, users.indexOf(user01));
        assertEquals("users size is one", 1, users.size());

        users.add(0, user02);

        assertEquals("users size is two", 2, users.size());

        assertEquals("user01 has position 1", 1, users.indexOf(user01));
        assertEquals("user02 has position 0", 0, users.indexOf(user02));
    }
}
