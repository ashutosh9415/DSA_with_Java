public class Constructor {
    public static void main(String[] args) {
        Student s = new Student(); //automatically called when object is created.
        System.out.println(s.name);
        Student s1 = new Student("John"); 
        System.out.println(s1.name);
        Student s2 = new Student(101, "Alice");
        System.out.println(s2.id + " " + s2.name);
    }
}
class Student {
    int id;
    String name;

    // Constructor
    Student(){   // non parameterized constructor.
        System.out.println("Constructor called ....");
        this.name = "Ashutosh";
    }
    //constructor name should be same as class name and not have any return type.

    Student(String name) {  // parameterized constructor.
        this.name = name;
    }
    Student(int id, String name) { // parameterized constructor.
        this.id = id;
        this.name = name;
    }
}
