public class PowerOfXisNByOptimized {
    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = Power(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq; 
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Power(x, n));
    }
}