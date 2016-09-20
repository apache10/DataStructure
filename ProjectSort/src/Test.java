import java.util.Scanner;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.exit;

/**
 * Created by gaurav on 20-09-2016.
 */
public class Test {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int size =indexSize();//taking the size of index from user
        int[] array = new int[size];

        int[] array1=Calculator.bestCase(size);
        int[] array2=Calculator.averageCase(size);
        int[] array3=Calculator.worstCase(size);

        System.out.println("enter 1 for best case ");
        System.out.println("enter 2 for average case ");
        System.out.println("enter 3 for worst case ");

        int j = input.nextInt();
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
        while(true) {
            System.out.println("select the given option");
            System.out.println("press 1 for Insertion sort");
            System.out.println("press 2 for Selection sort");
            System.out.println("press 3 for Bubble sort");
            System.out.println("press 4 for Quick sort");
            System.out.println("press 5 for Merge sort");
            System.out.println("press 6 for Heap sort");
            System.out.println("press 7 for Benchmark all");
            System.out.println("press 8 to Start again");
            System.out.println("press 9 to exit");
            int i = input.nextInt();
            if(!(i>9 && i==0)) {
                switch (i) {
                    case 1:
                        long start1 = System.currentTimeMillis();
                        Sort.insertion(array);
                        long end1 = System.currentTimeMillis();
                        System.out.println("Insertion Sort completed in     " + (end1-start1) +" milisec");
                        break;
                    case 2:
                        long start2 = System.currentTimeMillis();
                        Sort.selection(array);
                        long end2 = System.currentTimeMillis();
                        System.out.println("Selection Sort completed in     " + (end2-start2) +" milisec");
                        break;
                    case 3:
                        long start3 = System.currentTimeMillis();
                        Sort.bubble(array);
                        long end3 = System.currentTimeMillis();
                        System.out.println("Bubble Sort completed in    " + (end3-start3) +" milisec");
                        break;
                    case 4:
                        long start4 = System.currentTimeMillis();
                        Sort.quick(array);
                        long end4 = System.currentTimeMillis();
                        System.out.println("Quick Sort completed in     " + (end4-start4) +" milisec");
                        break;
                    case 5:
                        long start5 = System.currentTimeMillis();
                        Sort.merge(array);
                        long end5 = System.currentTimeMillis();
                        System.out.println("Merge Sort completed in     " + (end5-start5) +"milisec");
                        break;
                    case 6:
                        long start6 = System.currentTimeMillis();
                        Sort.heap(array);
                        long end6 = System.currentTimeMillis();
                        System.out.println("Heap Sort completed in      " + (end6-start6) +"milisec");
                        break;
                    case 7:
                        ThreadSort t1 = new ThreadSort(array);
                        t1.start();
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
            else
                System.out.println("please enter the valid number");
        }
    }
    public static int indexSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = input.nextInt();
        return size;
    }
}
