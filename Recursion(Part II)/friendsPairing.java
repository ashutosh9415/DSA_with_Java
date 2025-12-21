public class friendsPairing {
    public static int friendsPair(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // choice
        // single
        int fnm1 = friendsPair(n - 1);

        // pair
        int fnm2 = friendsPair(n - 2);
        int pairWays = (n - 1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPair(n));
    }
}
