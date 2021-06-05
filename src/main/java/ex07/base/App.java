/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex07.base;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Conversion area = new Conversion();

        System.out.print("What is the length of the room in feet? ");
        float length = input.nextFloat();

        System.out.print("What is the width of the room in feet? ");
        float width = input.nextFloat();

        System.out.println("The area is ");

        area.feet(length,width);
        area.squareMeters(length,width);
    }
}
