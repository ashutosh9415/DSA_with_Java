
import java.util.*;

public class ProductOfTwoNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Product of your number is: " + product);
    }
}