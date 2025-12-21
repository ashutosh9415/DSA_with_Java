import java.util.Scanner;
public class PrintArr {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter the length of array: ");
        int lengthArray = input.nextInt();
        int[] nums = new int[lengthArray];
        int i = 0;
        while (i < lengthArray){
            System.out.print("Enter the element of arrays "+(i)+":");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}
