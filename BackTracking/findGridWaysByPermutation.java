public class findGridWaysByPermutation {
    public static int findWays(int n, int m) {
        int totalMoves = (n - 1) + (m - 1);
        int downMoves = n - 1;
        int rightMoves = m - 1;

        return factorial(totalMoves) / (factorial(downMoves) * factorial(rightMoves));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int totalWays = findWays(n, m);
        System.out.println("Total ways to reach the bottom-right corner using permutations: " + totalWays);
    }
    
}
