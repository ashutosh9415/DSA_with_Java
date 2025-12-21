public class ClearBitInRange {
    public static int clearBitINrange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (i<<1)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitINrange(10,2,4));
    }
    
}
