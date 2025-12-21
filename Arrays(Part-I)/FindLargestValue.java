import java.util.*;

public class FindLargestValue{

    public static void getLargest(int Numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<Numbers.length;i++){
            if(largest <Numbers[i]){
                largest = Numbers[i];
            }
            if(smallest > Numbers[i]){
                smallest = Numbers[i];
            }
        }
        System.out.println("Your largest number is: "+largest);
        System.out.println("Your smallest number is: "+smallest);
    }

    public static void main(String args[]){
        int numbers[] = {4,6,9,2,5,8,1};

        getLargest(numbers);

    }
}