/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int length, width, areaFeet;
        double areaMeters, conversion = 0.09290304;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        length = input.nextInt();

        System.out.print("What is the width of the room in feet? ");
        width = input.nextInt();

        areaFeet = length * width;
        areaMeters = areaFeet * conversion;
        areaMeters = Math.round(areaMeters * 1000);
        areaMeters = areaMeters / 1000;

        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\nThe area is\n" + areaFeet + " square feet\n" + areaMeters + " square meters");
    }
}