package SEARCHINGandSORTING;

import java.util.*;

public class sortingInsertionSort {
    public static void insertionSortA(int array[]){
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int previous = i-1;
            while (previous >= 0 && array[previous] > current){
                array[previous+1] = array[previous];
                previous--;
            }
            array[previous+1] = current;
        }
    }
    
    public static void insertionSortD(int array[]){
        for(int i=1;i<array.length;i++){
            int current = array[i];
            int previous = i-1;
            while (previous >= 0 && array[previous] < current){
                array[previous+1] = array[previous];
                previous--;
            }
            array[previous+1] = current;
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of your Array: ");
            int arraySize = sc.nextInt();
            int sampleArray[] = new int[arraySize];
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print("Enter " + (i + 1) + " element: ");
                sampleArray[i] = sc.nextInt();
            }
            System.out.print("The array that you have entered is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
            System.out.println();
            insertionSortA(sampleArray);
            System.out.print("The array that you have entered after sorting in ASCENDING order is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
            System.out.println();
            insertionSortD(sampleArray);
            System.out.print("The array that you have entered after sorting in DESENDING order is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
        }
    }
}
