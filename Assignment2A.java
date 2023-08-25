/*
Class: CSE 1321L
Section:
Term: Fall 2023
Instructor: Milo Wilson
Name: Jose Lopez
Lab#: 2
 */

import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args) {
      System.out.println("Enter the length of one side: ");
      Scanner yy = new Scanner (System.in);
      float side = yy.nextFloat();

      float octP;
      octP = 8 * (side);
      System.out.println("Octagon Perimeter = " + octP);

      float octA;
      octA = (float) (2 * (1+ Math.sqrt(2))*(side*side));
      System.out.println("Octagon Area = " + octA);

      float radius;
      System.out.print("Enter the radius: ");
      Scanner u = new Scanner(System.in);
      radius = u.nextFloat();

      float height;
      System.out.println("Enter the height: ");
      Scanner uu = new Scanner(System.in);
      height = uu.nextFloat();

      float cylP;
      cylP = 2*(2*(radius) + (height));
      System.out.println("Cylinder Perimeter = " + cylP);

      double cylA;
        cylA = (2 * 3.14 * (radius) * (height)) + (2 * (3.14) * (radius * radius));
      System.out.println("Cylinder Area = " + cylA);





    }
}