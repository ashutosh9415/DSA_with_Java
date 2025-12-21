import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = sc.nextInt();
        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter your operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.print(A+B);
                break;
             case '-' : System.out.print(A-B);
                break;
             case '*' : System.out.print(A*B);
                break;
             case '/' : System.out.print(A/B);
                break;
             case '%' : System.out.print(A%B);
                break;

            default : System.out.println("you enter default operatoe.");
        }
    }
}