public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 90;   
        s1.marks[2] = 80;
        Student s2 = new Student(s1); // copy constructor is called. 
        for(int i = 0; i < 3; i++) {
            s1.marks[2] = 70;
            System.out.println(s2.marks[i]);
        }
    }
}
class Student {
    int marks[];


             // Shallow Copy Constructor

    // Student(Student s1){  
    //     marks = new int[3];
    //     this.marks = s1.marks; 
    // }


             // Deep Copy Constructor


    Student(Student s1){
        marks = new int[3];
        for(int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    Student() {  
        marks = new int[3];
    }
}
