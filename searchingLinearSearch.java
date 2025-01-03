package SEARCHINGandSORTING;

import java.util.*;

public class searchingLinearSearch {
    public static int linearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
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
            System.out.print("\nEnter the element you want to search for: ");
            int targetElement = sc.nextInt();
            int result = linearSearch(sampleArray, targetElement);
            if (result != -1) {
                System.out.print("Target Element found at index: " + result);
            }else{
                System.out.print("Target Element not found.");
            }
        }
    }
}
