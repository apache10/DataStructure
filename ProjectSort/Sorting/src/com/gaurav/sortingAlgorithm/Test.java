package com.gaurav.sortingAlgorithm;


import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Created by gaurav on 20-09-2016.
 */
public class Test {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int size = indexSize();//taking the size of index from user
        int[] array = new int[size];

        int[] array1=Calculator.bestCase(size);
        int[] array2=Calculator.averageCase(size);
        int[] array3=Calculator.worstCase(size);

        System.out.println("enter 1 for best case ");
        System.out.println("enter 2 for average case ");
        System.out.println("enter 3 for worst case ");
        int j = input.nextInt();
        /*int j=0;
        try{
        	j = input.nextInt();
        }finally{
        	input.close();//releasing the I/O
        }*/
        if(j>0 && j<4){
        switch(j){
            case 1:
                array = array1;
                break;
            case 2:
                array = array2;
                break;
            case 3:
                array = array3;
                break;
            default:
                System.out.println("Enter the valid input");
                Test.main(null);
                }
        }
        else{
        	System.out.println("Enter the valid input");
        }
        while(true) {
            System.out.println("select the given option");
            System.out.println("press 1 for Insertion sort");
            System.out.println("press 2 for Selection sort");
            System.out.println("press 3 for Bubble sort");
            System.out.println("press 4 for Quick sort");
            System.out.println("press 5 for Merge sort");
            System.out.println("press 6 for Heap sort");
            System.out.println("press 7 for Benchmark all");
            System.out.println("press 8 to	Start again");
            System.out.println("press 9 to	exit");
            int i = input.nextInt();
            if((i<10 && i>0)) {
                switch (i) {
                    case 1:
                        long start1 = System.currentTimeMillis();
                        int[] arrayI = array.clone();
                        Sort.insertion(arrayI);
                        long end1 = System.currentTimeMillis();
                        System.out.println("Insertion sort completed in    " + (end1-start1) +" milisec");
                        break;
                    case 2:
                        long start2 = System.currentTimeMillis();
                        int[] arrayS = array.clone();
                        Sort.selection(arrayS);
                        long end2 = System.currentTimeMillis();
                        System.out.println("Selection Sort completed in     " + (end2-start2) +" milisec");
                        break;
                    case 3:
                        long start3 = System.currentTimeMillis();
                        int[] arrayB = array.clone();
                        Sort.bubble(arrayB);
                        long end3 = System.currentTimeMillis();
                        System.out.println("Bubble Sort completed in    " + (end3-start3) +" milisec");
                        break;
                    case 4:
                        long start4 = System.currentTimeMillis();
                        int[] arrayQ = array.clone();
                        Sort.quick(arrayQ);
                        long end4 = System.currentTimeMillis();
                        System.out.println("Quick Sort completed in     " + (end4-start4) +" milisec");
                        break;
                    case 5:
                        long start5 = System.currentTimeMillis();
                        int[] arrayM = array.clone();
                        Sort.merge(array);
                        long end5 = System.currentTimeMillis();
                        System.out.println("Merge Sort completed in     " + (end5-start5) +"milisec");
                        break;
                    case 6:
                        long start6 = System.currentTimeMillis();
                        int[] arrayH = array.clone();
                        Sort.heap(arrayH);
                        long end6 = System.currentTimeMillis();
                        System.out.println("Heap Sort completed in      " + (end6-start6) +"milisec");
                        break;
                    case 7:
                        int[] arrayBench = array.clone();
                        InsertionThread t1 =new InsertionThread(arrayBench);
                        t1.start();
                        SelectionThread t2 =new SelectionThread(arrayBench);
                        t2.start();
                        BubbleThread t3 =new BubbleThread(arrayBench);
                        t3.start();
                        break;
                    case 8:
                        System.out.println("starting again");
                        Test.main(null);
                        break;
                    case 9:
                        System.out.println("pogram is closed");
                        exit(0);
                        break;
                    default:
                        return ;
                }
            }
            else{
                System.out.println("please enter the valid choice from below");
                }
        }
    }
    public static int indexSize() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = input.nextInt();
        /*int size = 0;
        try{
         size = input.nextInt();
        }catch(InputMismatchException  e){
        	System.out.println("Entered value is more than limt");
        	System.out.println("please eneter less than 4294967295");
        	Test.main(null);
        }
        finally{
        	input.close();
        }*/
        return size;
    }
}
