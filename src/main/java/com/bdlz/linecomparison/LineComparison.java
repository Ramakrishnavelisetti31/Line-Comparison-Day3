package com.bdlz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate of line: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter x2 co-ordinate of line: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y1 co-ordinate of line: ");
        int y1 = scanner.nextInt();
        System.out.println("Enter y2 co-ordinate of line: ");
        int y2 = scanner.nextInt();
        scanner.close();
        double length_Of_Line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Length of Line: " + length_Of_Line);
    }
}
