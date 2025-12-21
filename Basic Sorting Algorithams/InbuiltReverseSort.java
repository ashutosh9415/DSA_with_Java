import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltReverseSort {

    public static void printArrSort(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        Integer Array[] = new Integer[n];
        System.out.print("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }
        //Arrays.sort(Array,Collections.reverseOrder());
        Arrays.sort(Array,0,3,Collections.reverseOrder());
        System.out.print("Sorted array: ");
        printArrSort(Array);
    }
}
