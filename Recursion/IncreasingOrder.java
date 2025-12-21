public class IncreasingOrder {

    public static void printIncr(int n){
        if(n == 0){
            //System.out.println(1);   //(when n == 1 then use this line)
            return;
        }
        printIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncr(n);

    }
    
}
