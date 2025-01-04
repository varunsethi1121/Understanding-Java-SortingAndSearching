package SEARCHINGandSORTING;
import java.util.*;
public class searchingRotatedSortedArray {
    public static int searchRotatedSortedArray(int array[], int key, int startingIndex, int endingIndex){
        if(startingIndex>endingIndex){
            return -1;
        }
        int middleIndex = startingIndex + (endingIndex-startingIndex)/2;
        if(array[middleIndex] == key){
            return middleIndex;
        }
        //MID ON LINE 1
        if(array[startingIndex] <= array[middleIndex]){
            //SEARCH OPN THE LEFT OF THE MID 
            if(array[startingIndex] <= key && key <= array[middleIndex]){
                return searchRotatedSortedArray(array, key, startingIndex, middleIndex-1);
            }else{
                return searchRotatedSortedArray(array, key, middleIndex+1, endingIndex);
            }
        }
        //MID ON LINE 2
        else{
            if(key >= array[middleIndex] && key <= array[endingIndex]){
                return searchRotatedSortedArray(array, key, middleIndex+1, endingIndex);
            }else{
                return searchRotatedSortedArray(array, key, startingIndex, middleIndex-1);
            }
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
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
            int result = searchRotatedSortedArray(sampleArray, targetElement, 0, sampleArray.length-1);
            if(result!=-1){
                System.out.print("Target element found at index: " + result);
            }else{
                System.out.print("Element not found.");
            }
        }
    }
}
