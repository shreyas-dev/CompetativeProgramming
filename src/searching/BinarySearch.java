package searching;

public class BinarySearch {
    static int[] searchArr;
    public static int search(int arr[],int key){
        searchArr=arr;
        int low=0;
        int high=arr.length-1;
        return binarySearch(low,high,key);
    }

    private static int binarySearch(int low, int high, int key) {
        if(low<=high){
            int mid=(high+low)/2;
            if(searchArr[mid]==key)
                return mid;
            if(searchArr[mid]>key)
                return binarySearch(low,mid-1,key);
            else
                return binarySearch(mid+1,high,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr,6));
    }
}
