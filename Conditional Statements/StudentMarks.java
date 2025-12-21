import java.util.*;

public class StudentMarks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String student = (marks>=33) ? "PASS":"Fail";
        System.out.println("You are "+student+", and your marks is "+marks);
        
    }
}