package SEARCHINGandSORTING;

import java.util.*;

public class searchingSortingAllInOne {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // LINEAR SEARCH => BEST_CASE O(1), AVERAGE_CASE O(N), WORST_CASE O(N)
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // BINARY SEARCH => BEST_CASE O(1), AVERAGE_CASE O(LOGN), WORST_CASE O(LOGN)
    public static int binarySearch(int array[], int key) {
        int startingIndex = 0;
        int endingIndex = array.length - 1;
        while (startingIndex <= endingIndex) {
            int mid = startingIndex + (endingIndex - startingIndex) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                endingIndex = mid - 1;
            } else if (array[mid] < key) {
                startingIndex = mid + 1;
            }
        }
        return -1;
    }
    // BUBBLE SORT => BEST_CASE O(N), AVERAGE_CASE O(N^2), WORST_CASE O(N^2)
    public static void bubbleSortA(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortD(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortA(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPos = i;
            for(int j=i+1;i<array.length;j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }

    public static void selectionSortD(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPos = i;
            for(int j=i+1;i<array.length;j++){
                if(array[minPos] < array[j]){
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements you want to have in array: ");
            int arraySize = sc.nextInt();
            int sampleArray[] = new int[arraySize];
            for (int i = 0; i < sampleArray.length; i++) {
                System.out.print("Enter " + (i + 1) + " element: ");
                sampleArray[i] = sc.nextInt();
            }
            System.out.print("The array you have entered is: ");
            printArray(sampleArray);
            System.out.println("");
            System.out.println(
                    "Select a sorting or searching algorithm from the list below that you would like to implement: ");
            System.out.print("Press 1 for Searching and 2 for Sorting: ");
            int enteredChoiceInitial = sc.nextInt();
            if (enteredChoiceInitial == 1) {
                System.out.print("Press 1 for 'Binary Search' and 2 for 'Linear Search': ");
                int enteredChoiceFinal = sc.nextInt();
                System.out.print("Enter the element you want to search for: ");
                int targetElement = sc.nextInt();
                if (enteredChoiceFinal == 1) {
                    int ans = binarySearch(sampleArray, targetElement);
                    if (ans != -1) {
                        System.out.print("Element found at index: " + ans);
                    } else {
                        System.out.print("Element not found.");
                    }
                } else if (enteredChoiceFinal == 2) {
                    int ans = linearSearch(sampleArray, targetElement);
                    if (ans != -1) {
                        System.out.print("Element found at index: " + ans);
                    } else {
                        System.out.print("Element not found.");
                    }
                } else {
                    System.out.print("INVALID INPUT!!");
                }
            } else if (enteredChoiceInitial == 2) {
                System.out.print(
                        "Press 1 for 'Bubble Sort', 2 for 'Insertion Sort', 3 for 'Selection Sort', and 4 for 'Counting Sort': ");
                int enteredChoiceFinal = sc.nextInt();
                System.out.print("Press 1 for 'ASECENDING' and 2 for 'DESCENDING': ");
                int enteredChoiceFinalPro = sc.nextInt();
                if (enteredChoiceFinalPro == 1) {
                    if (enteredChoiceFinal == 1) {
                        bubbleSortA(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 2) {
                        // insertionSortA(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 3) {
                        selectionSortA(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 4) {
                        // countingSortA(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else {
                        System.out.print("INVALID INPUT!!");
                    }
                } else if (enteredChoiceFinalPro == 2) {
                    if (enteredChoiceFinal == 1) {
                        bubbleSortD(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 2) {
                        // insertionSortD(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 3) {
                        selectionSortD(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else if (enteredChoiceFinal == 4) {
                        // countingSortD(sampleArray);
                        System.out.print("Array after sorting is: ");
                        printArray(sampleArray);
                    } else {
                        System.out.print("INVALID INPUT!!");
                    }
                } else {
                    System.out.print("INVALID INPUT!!");
                }
            } else {
                System.out.print("INVALID INPUT!!");
            }
        }
    }
}
