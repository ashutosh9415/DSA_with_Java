import java.util.ArrayList;

public class swapTwoNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);
        list.add(9);
        list.add(1);

        int idx1 = 1,idx2 = 4;

        System.out.println(list);
        swap(list, idx1, idx2);

        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list,int n,int m){
        int temp = list.get(n);
        list.set(n, list.get(m));
        list.set(m, temp);
    }
}
