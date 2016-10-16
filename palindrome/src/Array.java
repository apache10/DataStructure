
public class Array {

	void rearrange(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            arr[i] += (arr[arr[i]] % n) * n;
 
        for (int i = 0; i < n; i++)
            arr[i] /= n;
    }
	
    void printArr(int arr[], int n) 
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    
    public static void main(String[] args) 
    {
        Array rearrange = new Array();
        int arr[] = {3, 2, 0, 1};
        int n = arr.length;
        System.out.println("Given Array is :");
        rearrange.printArr(arr, n);
        rearrange.rearrange(arr, n);
        rearrange.rearrange(arr, n);
        System.out.println("Modified Array is :");
        rearrange.printArr(arr, n);
    }
}