public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setType(5);
        System.out.println(p1.color);
        System.out.println(p1.type);

        Student s1 = new Student();
        s1.id = 101;
        s1.name = "John";
        System.out.println(s1.id);
        System.out.println(s1.name);

        BankAccount account = new BankAccount();
        account.username = "user123";
        // account.password = "pass123";    not accessible due to private access modifier
        account.accountNumber = 123456789;
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        if (account.withdraw(500.0)) {
            System.out.println("Withdrawal successful");
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
class Pen{
    String color;
    int type;

    // Method to set the color and type of the pen
    void setColor(String c){
        color = c;
    }
    void setType(int t){
        type = t;
    }

    void setTip(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class Student {
    int id;
    String name;

    // Constructor
    void Student(int i, String n) {
        id = i;
        name = n;
    }

}

class BankAccount {
    String username;
    private String password;
    int accountNumber;
    double balance;
    boolean withdraw;

    void setPassword(String pwd) {
        password = pwd;  // passward is accessible because it is within the same class.
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; // Insufficient funds
        }
    }

    // Method to check balance
    double getBalance() {
        return balance;
    }
}
