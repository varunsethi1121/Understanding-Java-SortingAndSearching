package SEARCHINGandSORTING;

import java.util.Scanner;

public class searchingBinarySearch {
    public static int binarySearch(int array[], int key) {
        int startingIndex = 0;
        int endingIndex = array.length - 1;
        while (startingIndex <= endingIndex) {
            int middleIndex = startingIndex + (endingIndex - startingIndex) / 2;

            if (array[middleIndex] == key) {
                return middleIndex;
            } else if (array[middleIndex] > key) {
                endingIndex = middleIndex;
            } else if (array[middleIndex] < key) {
                startingIndex = middleIndex + 1;
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
            int result = binarySearch(sampleArray, targetElement);
            if (result != -1) {
                System.out.print("Target Element found at index: " + result);
            } else {
                System.out.print("Target Element not found.");
            }
        }
    }
}
