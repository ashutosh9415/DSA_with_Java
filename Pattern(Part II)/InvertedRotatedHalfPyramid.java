import java.util.*;

public class InvertedRotatedHalfPyramid{

    public static void Inverted(int Row){
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=(Row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of row: ");
        int row = sc.nextInt();

        System.out.println("Your pattern is: ");
        Inverted(row);
    }
}