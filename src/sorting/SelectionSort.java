package sorting;

public class SelectionSort  implements Sort{
    /*
    The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array
     */
    public static int[] sort(int[] toSortArray){
        int N=toSortArray.length;
        int min;
        int temp;
        for(int i=0;i<N;i++){
            min=i;
            for (int j=i+1;j<N;j++){
                if(toSortArray[j]<toSortArray[min]){
                    min=j;
                }
            }
            temp=toSortArray[i];
            toSortArray[i]=toSortArray[min];
            toSortArray[min]=temp;
        }
        return toSortArray;
    }
}
