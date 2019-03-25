package dp;

public class LIS {
    public static int lis(int arr[],int n){
        int lis[]=new int[n];
        for(int i=0;i<n;i++){
            lis[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]&&lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
            }
        }
        int max=lis[0];
        for(int i=0;i<n;i++){
            if (max<lis[i])
                max=lis[i];
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[] = { 1,6,3,4,5,5};
        int n = arr.length;
        System.out.println("Length of lis is "
                + lis(arr, n));
    }
}
