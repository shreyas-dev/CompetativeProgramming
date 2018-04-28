package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsetOfASet {
    static List<List<Integer>> allSubSets=new ArrayList<>();

    public static void findAllSubset(int arr[],int size){
        //We have 2^N possible sets for a set of length N
        //1<<size will iterate for 2^Size Times
        for(int i=0;i<(1<<size);++i){
            //Create a new subset
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<size;j++){
                if((i&(1<<j))!=0){
                    list.add(arr[j]);
                }
            }
            allSubSets.add(list);
        }
    }
    public static void printAllSubset(){
        allSubSets.forEach((subSet)->{
            subSet.forEach((set)->{
                System.out.print(set+"\t");
            });
            System.out.println();
        });
    }
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int arr[]={1,2,9,11,14,15};
        findAllSubset(arr,arr.length);
        printAllSubset();
        long stop=System.currentTimeMillis();
        System.out.println("Time taken in milliseconds:"+(stop-start));
    }
}
