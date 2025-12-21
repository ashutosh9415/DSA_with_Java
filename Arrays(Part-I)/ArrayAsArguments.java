import java.util.*;

public class ArrayAsArguments{

    public static void update(int Marks[]){
        for(int i=0;i<Marks.length;i++){
            Marks[i] = Marks[i]+5;
        }
    }

    public static void main(String args[]){
        int marks[] = {59,65,70,82,78};

        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}