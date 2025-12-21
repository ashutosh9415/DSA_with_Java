import java.util.*;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] =temp;
        }
    }

    public static void printArrSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int Array[] = new int[n];
        System.out.print("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }

        selectionSort(Array);
        System.out.print("Sorted array: ");
        printArrSort(Array);
    }
}
