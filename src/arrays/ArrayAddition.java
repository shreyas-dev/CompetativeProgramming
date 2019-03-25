package arrays;

/*
    Given an array , consider it as an whole number and add one to it and then print the output.

   EX 1:
   INPUT:[1,0,9] //Considered as 109
   OUTPUT:[1,1,0] //109+1


   EX 2:
   INPUT:[9,9,9] //Considered as 999
   OUTPUT: [1,0,0,0] // 999+1
 */

import helpers.InputReader;

public class ArrayAddition {
    public static void main(String[] args) {
        InputReader inputReader=new InputReader(System.in);
        int n=inputReader.readInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=inputReader.readInt();
        }
        int[] output=logic(n,arr);
        for (int i: output){
            System.out.print(i+" ");
        }
    }

    public static int[] logic(int n ,int arr[]){
        boolean carryForward=true;
        for (int i = n-1 ;i >= 0;i--){
            if(arr[i]+1 > 9){
                arr[i] = 0;
            }
            else {
                carryForward = false;
                arr[i] += 1;
                break;
            }
        }
        if(carryForward){
            int[] out=new int[n+1];
            out[0]=1;
            return out;
        }
        return arr;
    }

}
