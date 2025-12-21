public class QuickSort {
    public static void quickSort(int[] array, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(array, si, ei);
        quickSort(array, si, pIdx - 1);   // left part
        quickSort(array, pIdx + 1, ei);   // right part
    }

    public static int partition(int[] array, int si, int ei) {
        int pivot = array[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap pivot with element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[ei];
        array[ei] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to QuickSort Program\n");
        int[] numArr = PrintArr.inputArray(); // assumes helper class exists
        quickSort(numArr, 0, numArr.length - 1);
        PrintArr.displayArray(numArr);
    }
}

