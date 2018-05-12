package sorting;

public class InsertionSort  implements Sort{
    public static int[] sort(int[] toSortArray){
        for(int i=0;i<toSortArray.length;i++){
            int temp=toSortArray[i];
            int j=i;
            while (j>0&&temp<toSortArray[j-1]){
                toSortArray[j]=toSortArray[j-1];
                j=j-1;
            }
            toSortArray[j]=temp;
        }
        return toSortArray;
    }
}
