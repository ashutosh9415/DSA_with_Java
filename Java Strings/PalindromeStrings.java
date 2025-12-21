import java.util.*;

public class PalindromeStrings {

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string only one case(lower/upper): ");
        String str = sc.nextLine(); // change this to test other strings
        if (palindrome(str)) {
            System.out.println("String is Palindrome.");
        } else {
            System.out.println("String is not Palindrome.");
        }
    }
}
