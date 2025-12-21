public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.college = "Apana College";
        Student s2 = new Student();
        System.out.println(s2.college);
    }
}
class Student{
     // static method(function)
    static int persentage(int phy, int chem, int math){
        return (phy + chem + math) / 3;
    }

    int rollno;
    String name;

    static String college;   // static property
    
    void setName(String name){
       this.name = name;
    }
    
    String getName(){ 
        return this.name;
    }
}