import java.util.*;

public class PrintLargestThreeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        if ((first>=second) && (first>=third)){
            System.out.println("Number first is large number: "+ first);
        }else if(second>=third){
            System.out.println("Number second is large number: "+ second);
        }else{
            System.out.println("Number third is large number: "+ third);
        }    
    }
}