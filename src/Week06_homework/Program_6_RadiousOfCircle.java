package Week06_homework;
import java.util.Scanner;
/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Program_6_RadiousOfCircle {

    public static void main(String[] args) {
        Scanner Rashang = new Scanner(System.in);//Create scanner to get radios from user
        System.out.println(" Please entre radius value of the circle and find out the area :");
        int r = Rashang.nextInt(); // store user input into variable
        //double pi = 3.14; // default value of PI
        double area = Math.PI*(r*r);// formula to calculate area)
        System.out.println(" The area of " + r + " radios of circle is " + area );// Print the result
        Rashang.close();

    }
}
