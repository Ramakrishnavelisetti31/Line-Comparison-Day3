package com.bdlz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static double lengthOfLine1,lengthOfLine2 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate of line1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter x2 co-ordinate of line1: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y1 co-ordinate of line1: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter y2 co-ordinate of line1: ");
        int y2 = scanner.nextInt();

        System.out.println("Enter p1 co-ordinate of line2: ");
        int p1 = scanner.nextInt();
        System.out.println("Enter p2 co-ordinate of line2: ");
        int p2 = scanner.nextInt();
        System.out.println("Enter q1 co-ordinate of line2: ");
        int q1 = scanner.nextInt();
        System.out.println("Enter q2 co-ordinate of line2: ");
        int q2 = scanner.nextInt();
        scanner.close();

        lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

        System.out.println("Length of Line1: " + lengthOfLine1);
        System.out.println("Length of Line2: " + lengthOfLine2);

        compareTo();
    }

       public static void compareTo(){
        if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Line1 is greater than line2");
        } else if (lengthOfLine1 < lengthOfLine2) {
            System.out.println("Line2 is greater than line1");
        } else {
            System.out.println("Both Lines are Equal");
        }
    }
}
