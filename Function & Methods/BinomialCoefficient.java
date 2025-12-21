import java.util.*;

public class BinomialCoefficient {

    public static double factorial (double n) {
        double fact = 1;
        for (double i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static double BinCoeff(double n, double r) {
        double fact_n = factorial(n);
        double fact_r = factorial(r);
        double fact_nmr = factorial(n - r);

       double  binCoeff =(fact_n / (fact_r * fact_nmr));
        return binCoeff;  // ✅ Added return statement
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        double num = sc.nextInt();
        System.out.print("Enter the value of r: ");
        double red = sc.nextInt();

        System.out.println(BinCoeff(num, red));
    }
}
