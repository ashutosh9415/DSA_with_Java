import java.util.*;

public class MaxSumOfSubArrayByPrefix{

    public static void subArraySumByPrefix(int Number[]){
    
        int maxSum = Integer.MIN_VALUE;
        int CurrSum =0;
        int prefix[] = new int[Number.length];
        prefix[0] = Number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+Number[i];
        }
        for(int i=0;i<Number.length;i++){
            for(int j=i;j<Number.length;j++){
                if(i==0){
                    CurrSum = prefix[j];
                }else{
                    CurrSum = prefix[j] - prefix[i-1];
                }
                if(maxSum < CurrSum){
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("Max sum of sub array is:"+maxSum);
        
    }

    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3 };
        
        subArraySumByPrefix(number);
    }
}