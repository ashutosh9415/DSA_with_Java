import java.util.*;

public class TaxCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lack: ");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = income * 0;
        }else if(income>=500000 && income<1000000){
            tax = (int)(income * .2);
        }else{
            tax = (int)(income * .3);
        }
        System.out.println("your tax for income is: "+tax);
    }
}