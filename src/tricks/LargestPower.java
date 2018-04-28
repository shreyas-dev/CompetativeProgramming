package tricks;

public class LargestPower {
    static long largestPower(long N)
    {
        //changing all right side bits to 1.
        N = N| (N>>1);
        N = N| (N>>2);
        N = N| (N>>4);
        N = N| (N>>8);
        N = N| (N>>16);
        N = N| (N>>32);

        //as now the number is 2 * x-1, where x is required answer, so adding 1 and dividing it by 2
        return (N+1)>>1;
    }

    public static void main(String[] args) {
        System.out.println(largestPower(64));
    }
}
