import java.util.*;

public class FloydsTriangle{

    public static void Triangle(int Row){
        int count =1;
        for(int i=1;i<=Row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
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