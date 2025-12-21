public class BackTrackingOnArray {
    public static void ArrayChangr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        // recursive case
        arr[i] = val;
        ArrayChangr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; // backtracking step
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayChangr(arr, 0, 1);
        printArray(arr);
    }
}
