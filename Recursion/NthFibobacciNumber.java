public class NthFibobacciNumber {
    // public static int fib(int n){
    //     if (n == 0){
    //         return 0;
    //     }else if(n == 1){
    //         return 1;
    //     }
    //     n = fib(n-1) + fib(n-2);
    //     return n;
    // }
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        int n = 26;
        System.out.println("The "+n+"th fibobacci number is: "+fib(n));
    }   
}
