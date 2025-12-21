import java.util.*;

public class PrintReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your number: ");
        int num = sc.nextInt();
        
        // int lastDigit;
        // while (num >0){
        //     lastDigit = num%10;
        //     System.out.print(lastDigit);
        //     num = num/10;
        // }
        // System.out.println();

        int lastDigit;
        int rev = 0;
        while (num >0){
            lastDigit = num%10;
            rev = (rev*10)+lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    
    }
}