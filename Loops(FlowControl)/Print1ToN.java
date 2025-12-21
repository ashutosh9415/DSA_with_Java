import java.util.*;

public class Print1ToN{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number til you want print: ");
        int num = sc.nextInt();

        int count = 1;
        System.out.print("your first "+ num +" number is:");
        while(count <= num){
            System.out.print(" "+ count);
            count++;
        }
        System.out.println();
    }
}