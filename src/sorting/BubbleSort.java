package sorting;


/*
Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their positions if they exist in the wrong order.

The complexity of bubble sort is big-oh(n^2) in both worst and average cases, because the entire array needs to be iterated for every element.


 */
public class BubbleSort implements Sort{
    public static int[] sort(int[] toSortArray){
        int N=toSortArray.length;
        int temp;
        for(int j=0;j<N;j++){
            for (int i=0;i<N-j-1;i++){
                if(toSortArray[i]>toSortArray[i+1]){
                    temp=toSortArray[i];
                    toSortArray[i]=toSortArray[i+1];
                    toSortArray[i+1]=temp;
                }
            }
        }
        return toSortArray;
    }
}
