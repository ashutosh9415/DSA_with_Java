public class findGridWays {
    public static int findWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i >= n || j >= m) {
            return 0;
        }

        // move downwards
        int downWays = findWays(i + 1, j, n, m);

        // move rightwards
        int rightWays = findWays(i, j + 1, n, m);

        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int totalWays = findWays(0, 0, n, m);
        System.out.println("Total ways to reach the bottom-right corner: " + totalWays);
    }
    
}



