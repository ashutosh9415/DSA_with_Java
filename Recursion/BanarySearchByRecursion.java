public class BanarySearchByRecursion {
    public static int binarySearch(int arr[], int si, int ei, int key) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // key found
        if (arr[mid] == key) {
            return mid;
        }
        // search in left half
        if (arr[mid] > key) {
            return binarySearch(arr, si, mid - 1, key);
        } else {
            // search in right half
            return binarySearch(arr, mid + 1, ei, key);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 40;

        int result = binarySearch(arr, 0, arr.length - 1, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
    
}
