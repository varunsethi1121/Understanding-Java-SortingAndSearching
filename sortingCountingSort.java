package SEARCHINGandSORTING;

import java.util.*;

public class sortingCountingSort {
    public static void countingSort(int array[]){
        int maximumElement = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if(array[i]>maximumElement){
                maximumElement = array[i];
            }
        }
        System.out.println("Maximum element present in the given array is: " + maximumElement);
        int countArray[] =new int[maximumElement+1];
        for(int i=0;i<array.length;i++){
            countArray[array[i]]++;
        }
        System.out.print("Array containing the frequency is: ");
        for(int i=0;i<countArray.length;i++){
            System.out.print(countArray[i] + " ");
        }
        int j=0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                array[j] = i;
                j++;
                countArray[i]--;
            }
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
            countingSort(sampleArray);
            System.out.println();
            System.out.print("The array that you have entered after sorting is: ");
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print(sampleArray[i] + " ");
            }
        }
    }
}
