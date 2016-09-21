package com.gaurav.sortingAlgorithm;

class InsertionThread extends Thread {
	
	public  int[] array;
	public InsertionThread(int[] array){
		this.array = array;
	}
	public void run() {
		long start1 = System.currentTimeMillis();
		Sort.insertion(array);
		long end1 = System.currentTimeMillis();
		System.out.println("Insertion Sort completed in     " + (end1-start1) +" milisec");
	}
	
}
