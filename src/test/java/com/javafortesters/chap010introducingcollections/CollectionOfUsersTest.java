package com.javafortesters.chap010introducingcollections;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;



/**
 * Created by jss on 31-1-16.
 */
public class CollectionOfUsersTest {

    @Test
    public void createCollection(){
        Collection<User> users = new ArrayList<>();
        User user01 = new User();
        User user02 = new User();
        users.add(user01);
        users.add(user02);
        assertEquals("users size should be two", 2, users.size());
        assertFalse("users should not be empty", users.isEmpty());

        Collection<User> moreUsers = new ArrayList<>();
        User user03 = new User();
        User user04 = new User();
        moreUsers.add(user03);
        moreUsers.add(user04);
        assertEquals("moreUsers size should be two", 2, users.size());
        assertFalse("moreUsers should not be empty", users.isEmpty());

        users.addAll(moreUsers);
        assertTrue("moreUsers are in users", users.containsAll(moreUsers));

        moreUsers.removeAll(moreUsers);
        assertEquals("moreUsers size should be 0", 0, moreUsers.size());
        assertTrue("moreUsers should be empty", moreUsers.isEmpty());

        users.clear();
        assertEquals("users size should be 0", 0, users.size());
        assertTrue("users should be empty", users.isEmpty());

    }

}
