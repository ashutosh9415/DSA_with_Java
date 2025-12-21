import java.util.*;

public class SumOfNNumber{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number til you want print: ");
        int num = sc.nextInt();

        int count = 1;
        int sum = 0;
        System.out.print("Sum of first "+ num +" number is:");
        while(count <= num){
            sum = sum+count;
            count++;
        }
        System.out.println(sum);
       
    }
}