package com.javafortesters.domainentities;

/**
 * Created by jss on 2-2-16.
 */
public class AdminUser extends User {
    public AdminUser(){
        this("adminuser", "password");
    }
    public AdminUser(String username, String password){
        super(username, password);
    }
    @Override
    public String getPermission(){
        return "Elevated";
    }
}