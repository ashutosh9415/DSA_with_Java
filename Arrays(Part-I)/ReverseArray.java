import java.util.*;

public class ReverseArray{

    public static void Reverse(int Number[]){
        int start = 0,end = Number.length - 1;

        while(start<end){
           int temp = Number[start];
           Number[start] = Number[end];
           Number[end] = temp;
           start++;
           end--;
        }
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        
        Reverse(number);
        System.out.print("Your reverse Array is: ");
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}