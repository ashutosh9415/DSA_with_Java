public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";  
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;   
        s1.marks[2] = 80;
        Student s2 = new Student(s1); // copy constructor is called.
        s2.password = "pqrs"; // this will not change the password of s1 object.
        for(int i = 0; i < 3; i++) {
            s1.marks[2] = 70;
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
    }
}
class Student {
    int id;
    String name;
    String password;
    int marks[];

    // Constructor
    Student(Student s1){   // non parameterized constructor.
        marks = new int[3];
        this.name = s1.name;
        this.id = s1.id;
        this.marks = s1.marks; 
    }
    Student() {  
        marks = new int[3];
        this.name = name;
    }
    Student(int id, String name) {
        marks = new int[3]; 
        this.id = id;
        this.name = name;
    }
}