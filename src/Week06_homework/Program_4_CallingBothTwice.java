package Week06_homework;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program_4_CallingBothTwice {
    int a = 1;  // two instance
    int b = 2; //  two instance
    static byte c = 3; // two static
    static byte d = 4; // two static

    public void myName(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void mySurname(){
        System.out.println(d);
        System.out.println(c);
        Program_4_CallingBothTwice obj = new Program_4_CallingBothTwice();
        System.out.println(obj.b);
        System.out.println(obj.a);
    }
    public static void main(String[] args) {
        Program_4_CallingBothTwice obj = new Program_4_CallingBothTwice();
        obj.myName();
        mySurname();
    }
}