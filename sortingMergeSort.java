package SEARCHINGandSORTING;

import java.util.Scanner;

public class sortingMergeSort {
    public static void mergeSorting(int array[], int startingIndex, int endingIndex){
        int middleIndex = startingIndex + (endingIndex-startingIndex)/2;
        if(startingIndex >= endingIndex){
            return;
        }
        mergeSort(array, startingIndex, middleIndex);
        mergeSort(array, middleIndex+1, endingIndex);
        mergeFunction(array, startingIndex, middleIndex, endingIndex);
    }

    public static void mergeFunction(int array[], int startingIndex, int middleIndex, int endingIndex){
        int i = startingIndex;
        int j = middleIndex+1;
        int k = 0;
        int tempArray[] = new int[endingIndex-startingIndex+1];
        while(i<=middleIndex && j<=endingIndex){
            if(array[i] < array[j]){
                tempArray[k] = array[i];
                i++;
            }else{
                tempArray[k] = array[j];
                j++; 
            }
            k++;
        }
        while(i<=middleIndex){
            tempArray[k++] = array[i++];
        }
        while(j<=endingIndex){
            tempArray[k++] = array[j++];
        }
        for(k=0,i=startingIndex;k<tempArray.length;k++,i++){
            array[i] = tempArray[k];
        }
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
            mergeSorting(sampleArray, 0, sampleArray.length-1);
            System.out.print("The array after performing merge sort is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
        }
    }
}
