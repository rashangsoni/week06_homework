package Week06_homework;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables  (in  side the class)
 * 2.2 Declare one static method ( in side the Class)
 * 2.3 Call both static variables into the static method inside the print statement. ( outside class)
 * 2.4 Declare the Main method. ( outside the method)
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program_2_CallingStatic {
    static int a = 10; // 2.1 static variables
    static int b = 20; // 2.1 static variables
    public static void myMethod1()     // 2.2 one static method
    {
        System.out.println(a);  // 2.3 both static variables into the static method
        System.out.println(b);  // // 2.3 both static variables into the static method
    }
        public static void main(String[] args) // 2.4 Declare the Main method.
        {myMethod1();}  //  2.5 static method into the Main method
        }
