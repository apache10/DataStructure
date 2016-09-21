package com.gaurav.sortingAlgorithm;

public class SelectionThread extends Thread {
	public  int[] array;
	public SelectionThread(int[] array){
		this.array = array;
	}
	public void run() {
		long start1 = System.currentTimeMillis();
		Sort.selection(array);
		long end1 = System.currentTimeMillis();
		System.out.println("Selection Sort completed in     " + (end1-start1) +" milisec");
	}
	


}
