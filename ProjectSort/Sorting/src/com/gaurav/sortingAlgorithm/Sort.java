package com.gaurav.sortingAlgorithm;
/**
 * Created by gaurav on 20-09-2016.
 */
public class Sort {
    public static void insertion(int[] array){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
    public static int[] selection(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }
    public static int[] bubble(int[] array){
        for (int c = 0; c < ( array.length - 1 ); c++) {
            for (int b = 0; b < (array.length - c - 1); b++) {
                if (array[b] < array[b + 1]) {
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] quick(int[] array){
        return array;
    }
    
    public static int[] merge(int[] array){
        public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
    return array;
    }
    public static int[] heap(int[] array){
        return array;
    }
}
