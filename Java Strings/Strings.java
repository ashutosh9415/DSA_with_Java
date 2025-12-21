import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c','d'};
        // String str = "asdf";
        // String sct = new String("qwer");

        // // String is IMMUTABLE.
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);
        String Fullname = "Ashutosh Vishwakarma";
        System.out.println(Fullname.length());

        // // concatenation
        // String firstName = "Ashutosh";
        // String lastName = "Vishwakarma";
        // String fullName = firstName + " " +lastName;
        // System.out.println(fullName);

        // String firstName = "Ashutosh";
        // String lastName = "Vishwakarma";
        // String fullName = firstName + " " +lastName;
        // System.out.println(fullName.charAt(2));         // h   is o/p.
        String firstName = "Ashutosh";
        String lastName = "Vishwakarma";
        String fullName = firstName + " " +lastName;
        printString(fullName);
    }
    public static void printString(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
