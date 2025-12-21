import java.util.*;

public class SumInputByUser{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of your number is: " + sum);
    }
}