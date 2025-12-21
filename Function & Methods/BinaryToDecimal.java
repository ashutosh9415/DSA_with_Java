public class BinaryToDecimal{

    public static void BinToDec(int binNum){
        int pow=0;
        int dec = 0;

        while(binNum > 0){
            int LD = binNum % 10;
            dec = dec + (LD * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+binNum +" is: "+dec);
    }

    public static void main(String args[]){

        BinToDec(10001);
    }
}