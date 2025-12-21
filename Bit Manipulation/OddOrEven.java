//package Apana Collage.Bit Manipulation;

public class OddOrEven {
    // public static void main(String[] args) {
    //     int n = 9;
    //     System.out.println((n & 1) == 0 ? "Even" : "Odd");
    // }


    public static void isOddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }

    public static void main(String[] args) {
      isOddOrEven(25);
      isOddOrEven(22);
      isOddOrEven(445334);  
    }
}
