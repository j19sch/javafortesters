package com.javafortesters.domainentities;

/**
 * Created by jss on 2-2-16.
 */
public class ReadOnlyUser extends User{

    public ReadOnlyUser(){
        super();
    }

    public String getPermission(){
        return "ReadOnly";
    }
}
