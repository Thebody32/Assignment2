/*
Class: CSE 1321L
Section:
Term: Fall 2023
Instructor: Milo Wilson
Name: Jose Lopez
Lab#: 2
 */


import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        int x_cord;
        System.out.println("Enter an X-coordinate ( Bottom left corner ) : ");
        Scanner aa = new Scanner(System.in);
        x_cord = aa.nextInt();

        int y_cord;
        System.out.println("Enter an X-coordinate ( Bottom left corner ): ");
        Scanner ss = new Scanner(System.in);
        y_cord = ss.nextInt();

        int width;
        System.out.println("Hit-box Width: ");
        Scanner cc = new Scanner(System.in);
        width = cc.nextInt();

        int height;
        System.out.println("Hit-box height: ");
        Scanner mm = new Scanner(System.in);
        height = mm.nextInt();

        int top;
        top = y_cord + height;

        int bottom;
        bottom = x_cord + width;

        System.out.println("Bottom-Left: " + x_cord + "," + y_cord);
        System.out.println("Top-Left: " + x_cord + "," + top);
        System.out.println("Bottom-Right: " + bottom + "," + y_cord);
        System.out.println("Top-Right: " + bottom + "," + top);
    }

}
