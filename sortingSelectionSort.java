package SEARCHINGandSORTING;

import java.util.*;

public class sortingSelectionSort {
    public static void selectionSortA(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPosition = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPosition]>array[j]){
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }
    public static void selectionSortD(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPosition = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPosition]<array[j]){
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
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
            selectionSortA(sampleArray);
            System.out.print("The array that you have entered after sorting in ASCENDING order is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
            System.out.println();
            selectionSortD(sampleArray);
            System.out.print("The array that you have entered after sorting in DESCENDING order is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
        }
    }
}
