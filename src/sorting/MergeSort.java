package sorting;

public class MergeSort {
    static int[] a;
    static int[] sortArray;
    public static int[] sort(int[] toSortArray){
        a=toSortArray;
        mergeSort(0,a.length-1);
        return a;
    }

    public static void mergeSort(int start,int end){
        int mid;
        if(start<end){
            mid=(start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            merge(start,mid,end);
        }
    }
    public static void merge(int start,int mid,int end){
        int p=start,q=mid+1;
        sortArray=new int[end-start+1];
        int k = 0;
        for (int i=start;i<=end;i++){
            if(p>mid){
                sortArray[k++]=a[q++];
            }
            else if(q>end)
                sortArray[k++]=a[p++];
            else if(a[p]>a[q]){
                sortArray[k++]=a[q++];
            }else
                sortArray[k++]=a[p++];
        }
        for (p=0 ; p< k ;p ++) {
            a[ start++ ] = sortArray[ p ] ;
        }
    }
}
