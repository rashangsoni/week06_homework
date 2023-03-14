package Week06_homework;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
//Instance and static variables
public class Program_3_CallingBoth {
    int a = 10;
    static int b = 2;

    // Instance Method
    public void multiplication() {
        System.out.println(a);
        System.out.println(Program_3_CallingBoth.b);
    }
    // Static Method
        public static void myMethod2() {
            Program_3_CallingBoth obj = new Program_3_CallingBoth();
            System.out.println(obj.a);
            System.out.println(b);
        }
    public static void main(String [] args){
        Program_3_CallingBoth obj = new Program_3_CallingBoth();
        obj.multiplication();
        myMethod2();

    }

    }

