package com.javafortesters.chap009arraysforloops;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WorkDaysSort {

    @Test
    public void sortWeekdays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Arrays.sort(workdays);

        String[] workdayschecksort = {"Friday", "Monday", "Thursday", "Tuesday", "Wednesday" };

        assertEquals("1st day", "Friday", workdays[0]);
        assertEquals("2nd day", workdayschecksort[1], workdays[1]);
        assertEquals("3rd day", workdayschecksort[2], workdays[2]);
        assertEquals("4th day", workdayschecksort[3], workdays[3]);
        assertEquals("5th day", workdayschecksort[4], workdays[4]);

    }

    @Test
    public void sortMixedCaseWeekdays(){
        String[] workdays =  {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};

        Arrays.sort(workdays);

        String[] workdayschecksort = {"Friday","Tuesday", "Wednesday", "monday", "thursday" };

        assertEquals("1st day mixed", "Friday", workdays[0]);
        assertEquals("2nd day mixed", workdayschecksort[1], workdays[1]);
        assertEquals("3rd day mixed", workdayschecksort[2], workdays[2]);
        assertEquals("4th day mixed", workdayschecksort[3], workdays[3]);
        assertEquals("5th day mixed", workdayschecksort[4], workdays[4]);
    }
}
