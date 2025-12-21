public class SubSet {
    public static void subSetPrint(String str, int i, String curr) {
        // base case
        if (i == str.length()) {
            if (curr.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(curr);
            }
            return;
        }
        subSetPrint(str, i + 1, curr + str.charAt(i));
        subSetPrint(str, i + 1, curr);
    }

    public static void main(String[] args) {
        String str = "abcdc";
        subSetPrint(str, 0, "");
    }
    
}
