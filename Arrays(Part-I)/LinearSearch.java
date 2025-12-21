public class LinearSearch{

    public static int linearSearch(int Number[] ,int Key){
        for(int i=0;i<Number.length;i++){
            if(Number[i]==Key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 12;

        int index = linearSearch(number ,key);
        if(index == -1){
            System.out.println("Key value is not exist in this arrays.");
        }else{
            System.out.println("Key value index is "+ index);
        }
    }
}