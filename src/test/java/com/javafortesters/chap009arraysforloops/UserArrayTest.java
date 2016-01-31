package com.javafortesters.chap009arraysforloops;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import org.junit.Assert;

public class UserArrayTest {

    @Test
    public void createUserArray(){
        User user01 = new User("a", "a");
        User user02 = new User("b", "b");
        User user03 = new User("c", "c");

        User userArray[] = new User[] {user01, user02, user03};

        Assert.assertEquals("user02 2nd member", user02, userArray[1]);

        for (User user : userArray){
            System.out.println(user.getUsername());
        }
    }


}
