/*
 * To check equality of two lines based on the end points, So that It can be known when two lines are equal.
 */
package com.lineComparison;
import java.util.Scanner;

public class lineComparisonUC2 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        // Taking Co-ordinates of two lines from user
        System.out.println("Enter the Value of x1 Co-ordinate for Line1: ");
        int x1 = line.nextInt();
        System.out.println("Enter the Value of y1 Co-ordinate  for Line1: ");
        int y1 = line.nextInt();
        System.out.println("Enter the Value of x2 Co-ordinate for Line1: ");
        int x2 = line.nextInt();
        System.out.println("Enter the Value of y2 Co-ordinate for Line1: ");
        int y2 = line.nextInt();

        System.out.println("Enter the Value of a1 Co-ordinate for Line2: ");
        int a1 = line.nextInt();
        System.out.println("Enter the Value of b1 Co-ordinate for Line2: ");
        int b1 = line.nextInt();
        System.out.println("Enter the Value of a2 Co-ordinate for Line2: ");
        int a2 = line.nextInt();
        System.out.println("Enter the Value of b2 Co-ordinate for Line2: ");
        int b2 = line.nextInt();
        
        //calulating length of line1
        Double length_of_line1 = Math.sqrt((x2 - x1) *(x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length of Line1 = " + length_of_line1);
        
        //calulating length of line2
        Double length_of_line2 = Math.sqrt((a2 - a1) *(a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("length of Line2 = " + length_of_line2);
        
        //Comparing the length of line1 and line2 using equals
        boolean compare = length_of_line1.equals(length_of_line2);
        if (compare)
            System.out.println("Both lines are equal");

        else
            System.out.println("Both lines are not equal");
    }
}