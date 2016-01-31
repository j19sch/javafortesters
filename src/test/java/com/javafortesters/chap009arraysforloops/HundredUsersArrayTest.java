package com.javafortesters.chap009arraysforloops;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

public class HundredUsersArrayTest {

    @Test
    public void createArrayHundredUsers(){
        User[] lotsofUsers = new User[100];

        for (int i=1; i<=100; i++){
            String username = "user" + i;
            String password = "password" + i;
            User user = new User(username,password);
            lotsofUsers[i-1] = user;
        }

        Assert.assertEquals("user 13", "user13", lotsofUsers[12].getUsername());
        Assert.assertEquals("user 100", "user100", lotsofUsers[99].getUsername());

        int j = 0;

        for (User user: lotsofUsers){
            Assert.assertEquals("username", "user" + (j+1), lotsofUsers[j].getUsername());
            Assert.assertEquals("password", "password" + (j+1), lotsofUsers[j].getPassword());
            j++;
        }

        int k = 1;

        for (User user: lotsofUsers) {
            Assert.assertEquals("username different", "user" + k, user.getUsername());
            Assert.assertEquals("password different", "password" + k, user.getPassword());
            k++;
        }

        Assert.assertEquals("array length 100",100, lotsofUsers.length);

    }
}
