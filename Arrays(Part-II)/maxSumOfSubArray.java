import java.util.*;

public class maxSumOfSubArray{

    public static void subArraySum(int Number[]){
    
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<Number.length;i++){
            for(int j=i;j<Number.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum = sum + Number[k];
                }
                System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
                if(min > sum){
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum of sub array is:"+max);
        System.out.println("Max sum of sub array is:"+min);
    }

    public static void main(String args[]){
        int number[] = {2,-5,6,4,-8,1};
        
        subArraySum(number);
    }
}