package com.gaurav.sortingAlgorithm;


/**
 * Created by gaurav on 20-09-2016.
 */
public class Calculator {
    public static int[] averageCase(int size)
    {

        int[] num=new int[size];// ??
        for(int i=0; i<num.length; i++)
        {
            num[i]=(int)(Math.random()*1000);

        }
        return num;

    }
    public static int[] bestCase(int size) {
        int[] num=new int[size];// ??
        for(int i=0; i<num.length; i++)
        {
            num[i]=i+1;
        }
        return num;

    }
    public static int[] worstCase(int size)
    {

        int[] num = new int[size];
        for(int i = num.length-1; i >= 0; i--){
            num[i] = i+1;
        }
        return num;

    }
}
