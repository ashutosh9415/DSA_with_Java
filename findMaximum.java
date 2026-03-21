import java.util.ArrayList;

public class findMaximum {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(7);
        list.add(3);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }

        System.out.println("Maximum element in list is: " + max);
    }
}
