import java.util.*;

public class HollowRhombus{

    public static void Hollow(int Row){
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=(Row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<Row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=Row;j++){
                if(i==1||i==Row||j==1||j==Row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
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
        Hollow(row);
    }
}