public class CharacterPattern{
    public static void main(String args[]){
        int n=5;
        char cha = 'A';
        for(int i=1;i<=n;i++){
            for(int ch=1;ch<=i;ch++){
                System.out.print(cha);
                cha++;
            }
            System.out.println();
        }
    }
}