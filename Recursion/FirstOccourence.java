public class FirstOccourence {
    public static int firstOccourence(int arr[], int i, int key){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccourence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,6};
        int key = 2;
        System.out.println(firstOccourence(arr, 0, key));
    }
    
}
