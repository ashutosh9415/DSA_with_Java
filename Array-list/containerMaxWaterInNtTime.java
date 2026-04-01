import java.util.ArrayList;

public class containerMaxWaterInNtTime {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWater(height));
    }

    public static int maxWater(ArrayList<Integer> height){
        int n = height.size();
        int maxWater = 0;
        int lp = 0;
        int rp = n-1;
        while(lp<rp){
            int nHig = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = nHig*width;
            maxWater = Math.max(maxWater, currWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}
