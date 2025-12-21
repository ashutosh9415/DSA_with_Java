import java.util.*;

public class TrappRainWater{

    public static int trappRain(int height[]){

        int max_left[] = new int[height.length];
        max_left[0] = height[0];
        for(int i=1;i<height.length;i++){
            max_left[i] = Math.max(height[i],max_left[i-1]);
        }

        int max_right[] = new int[height.length];
        max_right[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            max_right[i] = Math.max(height[i],max_right[i+1]);
        }

        int trappWater = 0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(max_left[i],max_right[i]);
            trappWater += waterLevel - height[i];
        }
        return trappWater;
    }
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please, Enter the number of elements in array.");
        // int n = sc.nextInt();

        // int Height[] = new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter the elements: ");
        //     Height[i] = sc.nextInt();
        // }
        int Height[] = {4,2,0,6,3,2,5};

        System.out.println(trappRain(Height));
    }
}
