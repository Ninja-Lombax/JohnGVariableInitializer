/*
This program simply declares and initializes variables and then displays them on the terminal.
This program is written by John Grasser
 */

package com.example;

public class InitializeVariables
{
    public static void main(String[] args)
    {
        // declares and initializes variables
        byte myByte = 20;
        short myShort = 1000;
        int myInt = 4000;
        long myLong = 10000;
        float myFloat = 98.7f;
        double myDouble = 1000.943;
        boolean myBool = true;
        char myChar = 'j';

        // Displays the variables on the terminal
        System.out.println("The byte is: " + myByte + "\nThe short is " + myShort + "\nThe integer is: " + myInt + "\nThe long is: " + myLong + "\nThe float is: " + myFloat + "\nThe double is: " + myDouble + "\nThe boolean is " + myBool + "\nThe character is: " + myChar);
    }
}
