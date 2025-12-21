import java.util.*;

public class TriangleBinary{

    public static void Triangle(int Row){
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of row: ");
        int row = sc.nextInt();

        System.out.println("Your pattern is: ");
        Triangle(row);
    }
}