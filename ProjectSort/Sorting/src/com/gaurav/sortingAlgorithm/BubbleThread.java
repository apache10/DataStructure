package com.gaurav.sortingAlgorithm;

public class BubbleThread extends Thread{	
	public  int[] array;
	public BubbleThread(int[] array){
		this.array = array;
	}
	public void run() {
		long start1 = System.currentTimeMillis();
		Sort.bubble(array);
		long end1 = System.currentTimeMillis();
		System.out.println("Bubble Sort completed in     " + (end1-start1) +" milisec");
		}

}
