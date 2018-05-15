package sorting;

import com.sun.istack.internal.NotNull;
import helpers.InputReader;
import helpers.OutputWriter;

import java.util.InputMismatchException;

public class InputsForSorting {
    static OutputWriter writer=new OutputWriter(System.out);
    static InputReader inputReader=new InputReader(System.in);
    public static void main(String[] args) {
        int inputs[]={100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        writer.printLine("Please select sorting algorithm");
        writer.printLine("1)BubbleSort");
        writer.printLine("2)Selection Sort");
        writer.printLine("3)Insertion Sort");
        writer.printLine("4)Merge Sort");
        try{
            int i=inputReader.readInt();
            long startTime;
            long endTime;
            switch (i){
                case 1:startTime=System.currentTimeMillis();
                        printArray(BubbleSort.sort(inputs));
                        endTime=System.currentTimeMillis();
                        writer.printLine("Time Taken for BubbleSort Algorithm is "+(endTime-startTime)+" ms");
                        break;
                case 2: startTime=System.currentTimeMillis();
                        printArray(SelectionSort.sort(inputs));
                        endTime=System.currentTimeMillis();
                        writer.printLine("Time Taken for Selection Sort Algorithm is "+(endTime-startTime)+" ms");
                        break;
                case 3: startTime=System.currentTimeMillis();
                        printArray(InsertionSort.sort(inputs));
                        endTime=System.currentTimeMillis();
                        writer.printLine("Time Taken for Insertion Sort Algorithm is "+(endTime-startTime)+" ms");
                        break;
                case 4: startTime=System.currentTimeMillis();
                        printArray(MergeSort.sort(inputs));
                        endTime=System.currentTimeMillis();
                        writer.printLine("Time Taken for Insertion Sort Algorithm is "+(endTime-startTime)+" ms");
                        break;
                default:writer.printLine("Invalid Option");
            }
        }catch (InputMismatchException e){
            writer.printLine("Input was not an integer");
        }
        writer.flush();
        writer.close();
    }
    public static void printArray(@NotNull int[] array){
        for(int i:array){
            writer.print(i+" ");
        }
        writer.printLine();
    }
}
