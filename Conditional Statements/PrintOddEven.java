import java.util.*;

public class PrintOddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.print("your number is even: "+num);
        }else{
            System.out.print("you number is ood: "+num);
        }
    }
}