package Week06_homework;
/**
 * 8. Write a program to calculate the area of a triangle.
 */
import java.util.Scanner;
public class Program_8_TraingleArea {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Entre the width of the Triangle:");
        double base = scanner.nextDouble();
        System.out.println ("Entre the height of the Triangle:");
        double height = scanner.nextDouble();
        // Area = (width * height)/2
        double area = (base * height)/2;
        System.out.println ("Area of Triangle is:" + area);
        scanner.close();
    }
}
