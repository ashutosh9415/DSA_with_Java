public class SumOfFirstNnumber {

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int totalSum = n + sum(n - 1);
        return totalSum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first "+n+" number is: "+sum(n));
    }    
}
