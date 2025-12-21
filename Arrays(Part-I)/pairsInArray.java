import java.util.*;

public class pairsInArray{

    public static void Pairs(int Number[]){
        int tp=0;
        for(int i=0;i<Number.length;i++){
            for(int j=i+1;j<Number.length;j++){
                System.out.print("("+Number[i]+","+Number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is:"+tp);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        
        Pairs(number);
    }
}