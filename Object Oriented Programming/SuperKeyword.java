public class SuperKeyword {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class horse extends Animal{
    horse(){
        super.color = "brown";
       // super();  // call parent class constructor
        System.out.println("Horse constructor is called");
    }
}