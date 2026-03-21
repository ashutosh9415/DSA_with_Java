import java.util.ArrayList;

public class OperationsArrList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        //Add operation
        list.add(1);     //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,25);  //O(n)

        System.out.println(list);

        // get Operation (it is work at index)

        int element = list.get(2);  //O(1)
        System.out.println(element);

        // Delete element or remove operations
        list.remove(4);        //O(n)
        System.out.println(list);

        //set operation
        list.set(0, 10);   //O(n)
        System.out.println(list);

        //contain Operations
        System.out.println(list.contains(10));     //O(n)
        System.out.println(list.contains(1));
    }
}
