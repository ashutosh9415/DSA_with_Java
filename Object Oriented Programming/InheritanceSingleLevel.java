public class InheritanceSingleLevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.legs = 4;
        System.out.println(dog.legs);
    }
}

//Single Level Inheritance
class Animal{
    int legs;

    void eat(){
        System.out.println("eating...");
    }
    void walk(){
        System.out.println("walking...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}