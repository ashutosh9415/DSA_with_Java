public class DecimalToBinary {

    public static void DecToBin(int DecNum) {
         
        int bin = 0;
        int pow = 0;

        while (DecNum > 0) {
            int rem = DecNum % 2;
            bin = bin + (rem * (int)Math.pow(10, pow)); 
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary of " + DecNum + " is: " + bin);
    }

    public static void main(String args[]) {
        DecToBin(16);  
    }
}
