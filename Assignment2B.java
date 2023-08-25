/*
Class: CSE 1321L
Section:
Term: Fall 2023
Instructor: Milo Wilson
Name: Jose Lopez
Lab#: 2
 */

import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args) {
       // a) Ask the user to enter a number (in seconds)//
        int seconds;
        System.out.println("Time in seconds: ");
        Scanner aa = new Scanner(System.in);
        seconds = aa.nextInt();

       /* Use the Modulo Operator to find how many hours, minutes, and seconds that
        represents*/
        int minutes = (seconds/60);
        int remMin = seconds % 60;
        int hours = (minutes/60);
        int remHour = minutes % 60;



        System.out.println("Converting...\n"+ seconds + " == " + hours + " hour(s), " + remHour +
                            " minute(s), " + remMin + " second(s).");





    }
}
