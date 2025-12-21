public class permutations {
    public static void permut(String str, String curr) {
        // base case
        if (str.length() == 0) {
            System.out.println(curr);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permut(ros, curr + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permut(str, "");
    }
}
