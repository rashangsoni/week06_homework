package Week06_homework;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class Program_9_Lowercase {

        public static void main(String[] args) {
            Scanner rashang = new Scanner(System.in);
            System.out.println( "Enter the word in  upper case");
            String txt = rashang.nextLine();
            String lowerCase = txt.toLowerCase();
            System.out.println(" Your answer in lower case  :" + lowerCase);
        }
    }
