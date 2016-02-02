package com.javafortesters.domainentities;


import com.javafortesters.domainobject.TestAppEnv;

public class User {

    public String username;
    private String password;

    public User() {
        this("username","password");
//        username = "username";
//        password = "password";
    }

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<7){
            throw new IllegalArgumentException("Password must be > 6 chars.");
        }
        this.password = password;
    }

    public String getTestAppEnvUrl(){
        return TestAppEnv.getUrl(); // static so no initialization
    }

    public String getPermission(){
        return "Normal";
    }
}