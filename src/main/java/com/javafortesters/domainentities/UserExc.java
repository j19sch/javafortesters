package com.javafortesters.domainentities;


import com.javafortesters.domainobject.TestAppEnv;

public class UserExc {

    public String username;
    private String password;

    public UserExc() {
        this("username","password", false);
//        username = "username";
//        password = "password";
    }

    private UserExc(String username, String password, boolean b) {
        // only call this because we don't want to throw the exception
        this.username = username;
        try{
            setPassword(password);
        }catch(InvalidPasswordException e){
            throw new IllegalArgumentException(
                    "Default password incorrect ", e);
        }
    }

    public UserExc(String username, String password) throws InvalidPasswordException {
        this.username = username;
        setPassword(password);
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws InvalidPasswordException {
        if(password.length()<7){
//            throw new IllegalArgumentException("Password must be > 6 chars.");
            throw new InvalidPasswordException("Password must be > 6 chars.");
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