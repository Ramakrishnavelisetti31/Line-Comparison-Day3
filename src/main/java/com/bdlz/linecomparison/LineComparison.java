package com.bdlz.linecomparison;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
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

        double length_Of_Line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double length_Of_Line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));

        System.out.println("Length of Line1: " + length_Of_Line1);
        System.out.println("Length of Line2: " + length_Of_Line2);

        boolean result = Objects.equals(length_Of_Line1,length_Of_Line2);
        if (result) {
            System.out.println("Both lines are Equal");
        } else {
            System.out.println("Both lines are Not Equal");
        }
    }
}
