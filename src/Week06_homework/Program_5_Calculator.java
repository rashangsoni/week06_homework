package Week06_homework;
/**
 * 5. Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).
 */
public class Program_5_Calculator {
    public static void main(String[] args) {
        subtraction();
        multiplication();
        Program_5_Calculator obj1 = new Program_5_Calculator();
        obj1.addition();
        obj1.division();
    }
    public static void subtraction() {
        int a = 10;
        int b = 20;
        int ans = a - b;
        System.out.println("subtraction of two number is : " + ans);
    }
    public static void multiplication() {
        int a = 15;
        int b = 2;
        int ans = a * b;
        System.out.println("multiplication of two number is : " + ans);
    }
    public void addition() {
        int a = 100;
        int b = 200;
        int ans = a + b;
        System.out.println("addition of two number is : " + ans);
    }
    public void division() {
        int a = 100;
        int b = 200;
        int ans = a + b;
        System.out.println("division of two number is : " + ans);
    }
}

