import static java.lang.System.currentTimeMillis;

/**
 * Created by gaurav on 20-09-2016.
 */
public class ThreadSort extends Thread {
    int[] array;

    public ThreadSort(int[] array) {
        this.array = array;
    }

    public void run(){
            long starti = currentTimeMillis();
            Sort.insertion(array);
            long endi = currentTimeMillis();
            long starts =currentTimeMillis();
            Sort.selection(array);
            long ends = currentTimeMillis();
            long startb = currentTimeMillis();
            Sort.bubble(array);
            long endb = currentTimeMillis();
            long startq = currentTimeMillis();
            Sort.quick(array);
            long endq = currentTimeMillis();
            long startm = currentTimeMillis();
            Sort.merge(array);
            long endm = currentTimeMillis();
            long starth = currentTimeMillis();
            Sort.heap(array);
            long endh = currentTimeMillis();

        }
}
