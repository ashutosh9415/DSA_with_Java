public class TilingProblem {
    public static int TilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // place tile vertically
         
        int verticalWays = TilingWays(n - 1);
        // place tile horizontally

        int horizontalWays = TilingWays(n - 2);
        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        int n = 3; 
        System.out.println("Number of ways to tile a 2 x " + n + " floor: " + TilingWays(n));
    }
    
}
