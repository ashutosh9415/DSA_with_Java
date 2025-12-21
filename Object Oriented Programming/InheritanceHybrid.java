public class InheritanceHybrid {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.color = "green";
        System.out.println(parrot.color);
        parrot.fly();
        parrot.talk();
        Shark shark = new Shark();
        shark.swim();
        Dog dog = new Dog();
        dog.walk();
        dog.bark();
        Cat cat = new Cat();
        cat.meow();
        Tuna tuna = new Tuna();
        tuna.swimFast();
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
class Fish extends Animal {
    
    void swim() {
        System.out.println("swimming...");
    }
}   
class Bird extends Animal {
    
    void fly() {
        System.out.println("fiying...");
    }
}
class Mannal extends Animal {
    int legs;

    void walk() {
        System.out.println("walking...");
    }
}
class Tuna extends Fish {
    int fins;

    void swimFast() {
        System.out.println("swimming fast...");
    }   
}
class Shark extends Fish {
    int teeth;

    void bite() {
        System.out.println("bitting...");
    }   
}
class Dog extends Mannal {
    
    void bark() {
        System.out.println("barking...");
    }
}
class Cat extends Mannal {
    
    void meow() {
        System.out.println("meowing...");
    }
}
class Parrot extends Bird {
    
    void talk() {
        System.out.println("talking...");
    }
}