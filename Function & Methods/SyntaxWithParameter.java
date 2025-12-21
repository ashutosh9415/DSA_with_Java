import java.util.*;

public class SyntaxWithParameter{

    public static int calcuiateSum(int num1, int num2){ //parameters  or farmal parameters
        
        int sum = num1 + num2;
        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcuiateSum(a, b);  //call function or arguments or actual parameters.
        System.out.println("Sum is : "+sum);
    }
}
