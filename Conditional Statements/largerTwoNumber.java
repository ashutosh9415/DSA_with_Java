import java.util.*;

public class largerTwoNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first>=second){
            System.out.println("Number first is large number: "+ first);
        }else{
            System.out.println("Number second is large number: "+ second);
        }
    }
}