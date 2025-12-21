public class SubString{

    public static String sub_string(String str,int st,int ed){
        String substr = "";
        for(int i=st;i<ed;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        // System.out.println(sub_string(str,2,7));
        System.out.println(str.substring(2,7));
    }
}