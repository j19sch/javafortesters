package com.javafortesters.chap010introducingcollections;

import com.javafortesters.domainentities.User;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jss on 31-1-16.
 */
public class SetOfUsersTest {

    @Test
    public void setOfUsers(){
        Set users = new HashSet();

        assertEquals("set size should be zero", 0, users.size());

        User user = new User();

        users.add(user);

        assertEquals("set size should be one", 1, users.size());

        users.add(user);

        assertEquals("set size should be one", 1, users.size());

    }
}
