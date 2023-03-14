package Week06_homework;
import java.util.Scanner;
/**
 * 15. Write a Java program to swap two variables.
 */
public class Program_15_SwapTwoVariables {
    public static void main(String[] args) {
        Scanner Rashang = new Scanner(System.in);
        System.out.println("input num1: ");
        int a = Rashang.nextInt();
        System.out.println("input num2: ");
        int b = Rashang.nextInt();
        System.out.println("Before Swapping = " + a + "; " + b);
        int ab;
        ab = a;
        a = b;
        b = ab;
        System.out.println("after Swapping = " + a + "; " + b);
        Rashang.close();
    }
}