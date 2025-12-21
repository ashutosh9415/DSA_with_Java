import java.util.*;

public class MaxSumOfSubArrayByKadanes{

    public static void Kadanes(int Number[]){
        int maxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        for(int i=0;i<Number.length;i++){
            CurrSum = CurrSum+Number[i];
            if(CurrSum < 0){
                CurrSum = 0;
            }
            maxSum = Math.max(CurrSum,maxSum);
        }
        System.out.println("Max sum of sub array is:"+maxSum);    
    }

    public static void main(String args[]){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};

        Kadanes(number);
    }
}




