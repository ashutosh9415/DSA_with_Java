import java.util.*;

public class ProductOfTwoNumberBy {

    public static double Product(double a, double b){
        
        double mul = a * b;
        return mul;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
        double product = Product(first, second);
        System.out.println("Product is : "+product);
    }
}