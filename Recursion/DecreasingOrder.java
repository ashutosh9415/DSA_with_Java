public class DecreasingOrder {

    public static void printDecr(int n){
        if(n == 0){
            //System.out.println(n);   //(when n == 1 then use this line)
            return;
        }
        System.out.print(n+" ");
        printDecr(n-1);
    }
    public static void main(String[]  args) {
        int n = 10;
        printDecr(n);
    }
}
