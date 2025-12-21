public class LastOccourence {
    public static int lastOccourence(int arr[], int i, int key){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccourence(arr, i+1, key);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,6};
        int key = 2;
        System.out.println(lastOccourence(arr, 0, key));
    }
    
}
