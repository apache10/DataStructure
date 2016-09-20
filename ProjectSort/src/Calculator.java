/**
 * Created by gaurav on 20-09-2016.
 */
public class Calculator {
    public static long[] averageCase(long[] size)
    {

        long[] num=new long[size];// ??
        for(long i=1; i<=num.length; i++)
        {
            num[i]=(long)(Math.random()*1000);

        }
        return num;

    }
    public static long[] bestCase(long[] size)
    {

        long[] num=new long[size];// ??
        for(long i=1; i<=num.length; i++)
        {
            num[i]=i;

        }
        return num;

    }
    public static long[] worstCase(long[] size)
    {

        long[] num=new long[size];// ??
        for(long i=num.length; i>0; i--)
        {
            num[i]=(long)(Math.random()*1000);

        }
        return num;

    }
}
