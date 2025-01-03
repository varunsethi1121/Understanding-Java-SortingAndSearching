package SEARCHINGandSORTING;

import java.util.Scanner;

public class sortingQuickSort {
    public static void quickSort(int array[], int startingIndex, int endingIndex){
        if(startingIndex>=endingIndex){
            return;
        }
        int pivotIndex = partitionFunction(array , startingIndex, endingIndex);
        quickSort(array, startingIndex, pivotIndex-1);
        quickSort(array, pivotIndex+1, endingIndex);
    }
    public static int partitionFunction(int array[], int startingIndex, int endingIndex){
        int pivotElement = array[endingIndex];
        int i = startingIndex-1;
        for(int j=startingIndex;j<endingIndex;j++){
            if(array[j] <= pivotElement){
                i++;
                //SWAPPING
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        int temp = pivotElement;
        array[endingIndex] = array[i]; // pivotElement = array[i];
        array[i] = temp;
        return i;
    }
    public static void main(String args[]){
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
            quickSort(sampleArray, 0, sampleArray.length-1);
            System.out.print("The array after performing merge sort is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
        }
    }
}
