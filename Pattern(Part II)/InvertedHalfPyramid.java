import java.util.*;

public class InvertedHalfPyramid{

    public static void InvertedHalf(int Row){
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=(Row-i+1);j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of row: ");
        int row = sc.nextInt();

        System.out.println("Your pattern is: ");
        InvertedHalf(row);
    }
}