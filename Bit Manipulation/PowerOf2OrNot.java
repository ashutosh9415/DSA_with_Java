public class PowerOf2OrNot {
    public static void powerOf2OrNot(int n){
        int bitMask = n-1;
        if((n & bitMask) == 0){
            System.out.println("Power of 2");
        }else{
            System.out.println("Not a power of 2");
        }
    }
    public static void main(String[] args) {
        powerOf2OrNot(10);
    }
    
}
