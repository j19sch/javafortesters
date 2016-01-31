package com.javafortesters.chap010introducingcollections;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jss on 31-1-16.
 */
public class MapOfUsersTest {

    @Test
    public void mapOfUsers(){
        Map<String,User> userMap = new HashMap<>();

        User user01 = new User();
        User user02 = new User();

        assertTrue("userMap should be empty", userMap.isEmpty());

        userMap.put("new_user", user01);
        assertEquals("userMap size should be one", 1, userMap.size());

        userMap.put("new_user", user02);

        assertEquals("userMap size still should be one", 1, userMap.size());

    }
}
