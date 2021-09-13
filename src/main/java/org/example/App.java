package org.example;

import java.net.Authenticator;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner askInput = new Scanner(System.in);
        System.out.println( "What is the input string?" );

        String input = askInput.nextLine();
        if(input.isEmpty()) {
            System.out.println("Nothing was entered, please try again!");
        }
        else {
            int inputChar = input.length();
            System.out.println(input + " has " + inputChar + " characters including spaces.");
        }
    }
}
