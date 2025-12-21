public class InheritanceMultiLevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color = "black";
        dog.walk();
        System.out.println(dog.color);
        dog.legs = 4;
        System.out.println(dog.legs);
    }
}
class Animal {
    String color;

    void eat() {
        System.out.println("eating...");
    }

    void sleep() {
        System.out.println("sleeping...");
    }   
}
class Mannal extends Animal {
    int legs;

    void walk() {
        System.out.println("walking...");
    }
}   
class Dog extends Mannal {
    
    void bark() {
        System.out.println("barking...");
    }
}