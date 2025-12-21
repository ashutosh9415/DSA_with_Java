public class PowerOfXisN {
    public static int Power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * Power(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(Power(x, n));
    }
}
