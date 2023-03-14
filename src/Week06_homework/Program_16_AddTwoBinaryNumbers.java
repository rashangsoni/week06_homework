package Week06_homework;
/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
import java.util.Scanner;
public class Program_16_AddTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner Rashang = new Scanner(System.in);
        System.out.println(" Please entre the first binary number:");
        String a = Rashang.next();
        System.out.println(" Please entre the second binary number:");
        String b = Rashang.next();
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int num3 = num1 + num2;
        System.out.println( "a = " + Integer.toBinaryString(num1));
        System.out.println( "b = " + Integer.toBinaryString(num2));
        System.out.println ("Sum of two binary numbers + a+b: " +Integer.toBinaryString(num3));
        Rashang.close();
    }
}
