package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "What is the quote?" );
        String quote = reader.nextLine(); // Takes in the string

        System.out.println( "Who said it?" );
        String sayer = reader.nextLine();

        System.out.println(sayer + " says, \"" + quote + "\"");
    }
}