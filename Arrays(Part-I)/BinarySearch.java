import java.util.*;

public class BinarySearch{

    public static int binarySearch(int Number[] ,int Key){
        int start = 0,end = Number.length - 1;

        while(start<=end){
            int mid = (start + end)/2;
            if(Number[mid] == Key){
                return mid;
            }else if(Number[mid] < Key){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;

        int index = binarySearch(number, key);
        if(index == -1){
            System.out.println("Key value is not exist in this arrays.");
        }else{
            System.out.println("Key value index is "+ index);
        }
    }
}