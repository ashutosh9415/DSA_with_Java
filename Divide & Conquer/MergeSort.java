public class MergeSort {
    public static void mergeSort(int[] array, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(array, si, mid);
        mergeSort(array, mid + 1, ei);
        merge(array, si, mid, ei);
    }
    public static void merge(int[] array, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = array[i++];    
        }
        while (j <= ei) {
            temp[k++] = array[j++];    
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to mergeSort Program\n");
        int[] numArr = PrintArr.inputArray();
        mergeSort(numArr, 0, numArr.length - 1);
        PrintArr.displayArray(numArr);
    }
}
