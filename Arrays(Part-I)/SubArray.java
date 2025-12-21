import java.util.*;

public class SubArray{

    public static void subArray(int Number[]){
        int Total_SubArray=0;
        
        for(int i=0;i<Number.length;i++){
            for(int j=i;j<Number.length;j++){
                for(int k=i;k<=j;k++){
                   System.out.print(Number[k]+" ");
                }
                Total_SubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array is:"+Total_SubArray);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        
        subArray(number);
    }
}