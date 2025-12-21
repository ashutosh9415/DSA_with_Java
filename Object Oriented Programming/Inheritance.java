public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
        shark.color = "grey";
        System.out.println(shark.color);
    }
}

// base(super) class
class Animal{
    String color;
    void eat(){
        System.out.println("eating...");
    }
    void sleep(){
        System.out.println("sleeping...");
    }   
}

// derived(child) class
class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("swimming...");
    }
}