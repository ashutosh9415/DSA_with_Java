public class InheritanceHierarchial {
    public static void main(String[] args) {
       Fish fish = new Fish();
       fish.color = "golden";
       System.out.println(fish.color);
       fish.eat();
       fish.swim();
       Mannal mannal = new Mannal();
       mannal.walk();
       Bird bird = new Bird();
       bird.fly();
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
   
    void walk() {
        System.out.println("walking...");
    }
}   
class Bird extends Animal {
    
    void fly() {
        System.out.println("fiying...");
    }
}
class Fish extends Animal {
    
    void swim() {
        System.out.println("swimming...");
    }
}
