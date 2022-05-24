package com.bridgelabz;
import java.util.Scanner;

public class TwoLIneEquality {
    public static void main(String[] args) {

        double x1,x2,y1,y2;
        double x3,x4,y3,y4;
        Double lengthOfLineOne,lengthOfLineTwo;
        Scanner sc = new Scanner(System.in);

        // for first line
        System.out.println("Enter the value of x1 :");
        x1 = sc.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();
        lengthOfLineOne = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        // for second line
        System.out.println("Enter the value of x3 :");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = sc.nextInt();
        lengthOfLineTwo = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));

        System.out.println("Length of line one = " +lengthOfLineOne);
        System.out.println("Length of line two = " +lengthOfLineTwo);

        if(lengthOfLineOne.equals(lengthOfLineTwo))
            System.out.println("Length of the lines are equal");
        else
            System.out.println("Lengths are not equal ");
    }
}