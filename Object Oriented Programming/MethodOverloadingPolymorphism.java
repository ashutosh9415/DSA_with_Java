public class MethodOverloadingPolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.Sum(2, 3));
        System.out.println(calc.Sum(2, 3, 4));
        System.out.println(calc.Sum(2.5, 3.5));
    }

}
class Calculator {
    int Sum(int a, int b){
        return a+b;
    }
    int Sum(int a, int b, int c){
        return a+b+c;
    }
    double Sum(double a, double b){
        return a+b;
    }

}
