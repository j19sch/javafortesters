package com.javafortesters.chap011introducingexceptions;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jss on 2-2-16.
 */
public class ExceptionExampleTest {

    @Test
    public void throwANullPointerException() {
        Integer age = null;
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void doesNotThrowANullPointerException() {
        Integer age = 18;
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            System.out.println("getMessage - " +
                    e.getMessage());
            System.out.println("getStacktrace - " +
                    e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();

            System.out.println("StackTrace length: "+ e.getStackTrace().length);
            System.out.println(e.getStackTrace()[0]);

            age = 18;
            ageAsString = age.toString();
        }
        String yourAge =
                "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }

    @Test(expected = IllegalArgumentException.class)
    public void userWithTooShortPassword(){
        User user = new User("user", "short");
    }

    @Test
    public void tryCatchFinallyANullPointerException(){
        Integer age=18;
//        Integer age=null;
        String ageAsString;
        String yourAge="";
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }finally{
            yourAge = "You are " + age.toString() + " years old";
        }
        assertEquals("You are 18 years old", yourAge);
    }
}
