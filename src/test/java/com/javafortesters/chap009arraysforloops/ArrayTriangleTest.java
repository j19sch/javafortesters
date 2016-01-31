package com.javafortesters.chap009arraysforloops;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import org.junit.Test;

public class ArrayTriangleTest {

    public void print2DIntArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    @Test
    public void createTriangleArray(){
        int[][] triangle = new int[16][];
        int i = 0;

        for (int[] inner : triangle){

            inner = new int[i+1];

            for (int j = 0; j <= i; j++){
                inner[j] = j;
            }

            triangle[i] = inner;
            i++;
        }

        System.out.println("First print");
        print2DIntArray(triangle);
    }

    @Test
    public void createTriangleArrayToo(){
        int[][] triangle = new int[16][];

        for (int i = 0; i < triangle.length; i++){
            int[] inner;
            inner = new int[i+1];

            for (int j = 0; j <= i; j++){
                inner[j] = j;
            }

            triangle[i] = inner;
        }

        System.out.println("Second print");
        print2DIntArray(triangle);
    }

    @Test
    public void createTriangleArrayThree(){
        int[][] triangle = new int[16][];
        int i = 0;

        for (int[] inner : triangle){

            inner = new int[i+1];

            for (int j = 0; j < inner.length; j++){
                inner[j] = j;
            }

            triangle[i] = inner;
            i++;
        }

        System.out.println("Third print");
        print2DIntArray(triangle);
    }


    //Arrays.fill( array , startIndex , endItemCount , value );

}
