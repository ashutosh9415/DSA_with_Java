import java.util.*;

public class HollowRectangle{

    public static void Hollow(int Row, int Colum){
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=Colum;j++){
                if(i==1 || j==1 || i==Row || j==Colum){
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
        System.out.print("Enter the no. of colum: ");
        int colum = sc.nextInt();

        System.out.println("Your pattern is: ");
        Hollow(row,colum);
    }
}