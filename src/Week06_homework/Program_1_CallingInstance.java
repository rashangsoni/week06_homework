package Week06_homework;
/**
 * 1.Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program_1_CallingInstance {
    int a = 10; // 1.1 instance variables.
    int b = 22; //1.1instance variables.
    public void myMehtod() // 1.2 Instance Method
    {
        System.out.println(a + b); // 1.3 both instance variables into the instance method
        System.out.println("myMethod " + (a + b)); // 1.3 both instance variables into the instance method
    }
    public static void main(String[] args) {
        Program_1_CallingInstance obj = new Program_1_CallingInstance();
        obj. myMehtod(); // the above instance method into the Main method
    }
}
