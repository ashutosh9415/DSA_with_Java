import java.util.*;

public class SumOfSubArray{

    public static void subArraySum(int Number[]){
        
        for(int i=0;i<Number.length;i++){
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=i;j<Number.length;j++){
                sum = sum + Number[j];
                System.out.println(sum);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        
        subArraySum(number);
    }
}