import java.util.*;

public class ArrayCC{
    public static void main(String args[]){
        int Marks[] = new int[50];

        // int number[] ={1,4,6,8};

        // String fruits[] = {"Mango","Apple","Banana","Orange"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first marks: ");
        Marks[0] = sc.nextInt();
        System.out.print("Enter the Second marks: ");
        Marks[1] = sc.nextInt();
        System.out.print("Enter the third marks: ");
        Marks[2] = sc.nextInt();

        // System.out.println(Marks.length);
        // System.out.println(Marks[0]); 
        // System.out.println(Arrays.toString(Marks));

        int presentages = (Marks[0]+Marks[1]+Marks[2])/3;
        System.out.println("Persentage of marks is :"+ presentages);

    }
}