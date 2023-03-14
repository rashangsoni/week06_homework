package Week06_homework;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.5 * 8.5 = 46.75
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program_14_AreaAndPerimeter {
    public static void main(String[] strings) {
        Scanner Rashang = new Scanner(System.in);
        System.out.println( "Input Width = ");
        double width = Rashang.nextDouble();
        System.out.println( "Input Height = ");
        double Height = Rashang.nextDouble();
        System.out.println( " Area is = " + width * Height);
        System.out.println( " Perimeter is = "  + 2  * (width + Height ));
        Rashang.close();
    }
}

