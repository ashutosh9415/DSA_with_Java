public class BinaryStringProblem1 {
    public static void binaryString(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // choice
        // place 0
        binaryString(n - 1, 0, str + "0");
        // place 1
        if (lastPlace == 0) {
            binaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        binaryString(n, 0, "");
    } 
}
