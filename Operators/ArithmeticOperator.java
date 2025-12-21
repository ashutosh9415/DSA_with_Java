//Binary Operators

/*public class ArithmeticOperator{
    public static void main(String args[]){
        int A=10;
        int B=5;
        System.out.println("Sum = "+(A+B));
        System.out.println("Sub = "+(A-B));
        System.out.println("Mul = "+(A*B));
        System.out.println("Div = "+(A/B));
        System.out.println("Mod = "+(A%B));
    }
}*/


//Unary Operators

public class ArithmeticOperator{
    public static void main(String args[]){
       /* int A=10;
        int B=++A;           //Pre increment
        System.out.println(A);
        System.out.println(B);*/



        int A=10;
        int B=A++;           //post increment
        System.out.println(A);
        System.out.println(B);
    }
}