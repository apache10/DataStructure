/**
 * Created by gaurav on 20-09-2016.
 */
public class Sort {
    public static int[] insertion(int[] array){
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
        return array;
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
        return array;
    }
    public static int[] heap(int[] array){
        return array;
    }
}
