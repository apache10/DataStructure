package com.gaurav;

public class SieveOfEratosthenes {
	public void sieveOfEratosthenes(int num)
	    {
	        boolean prime[] = new boolean[num+1];
	        for(int i=0;i<num;i++)
	            prime[i] = true;
	         
	        for(int j = 2; j*j <=Math.sqrt(num); j++)
	        {
	            if(prime[j] == true)
	            {
	                for(int i = j*2; i <= num; i += j)
	                    prime[i] = false;
	            }
	        }
	         
	        for(int i = 2; i <= num; i++)
	        {
	            if(prime[i] == true)
	                System.out.print(i + " ");
	        }
	    }
	    public static void main(String args[])
	    {
	        int num = 100;
	        System.out.println("Prime numbers smaller than and equal to"+num);
	        SieveOfEratosthenes obj = new SieveOfEratosthenes();
	        obj.sieveOfEratosthenes(num);
	    }

}
