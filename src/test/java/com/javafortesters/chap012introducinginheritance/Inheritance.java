package com.javafortesters.chap012introducinginheritance;

import com.javafortesters.domainentities.ReadOnlyUser;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jss on 2-2-16.
 */
public class Inheritance {

    @Test
    public void normalUserVersusReadOnly(){
        User user = new User();
        ReadOnlyUser roUser = new ReadOnlyUser();

        assertEquals("users have same username", user.getUsername(), roUser.getUsername());
        assertEquals("users have same password", user.getPassword(), roUser.getPassword());

        assertEquals("user has normal permission", "Normal", user.getPermission());
        assertEquals("user has read-only permission", "ReadOnly", roUser.getPermission());
    }
}
