package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;

public class ComparingNumbers
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int first, second, third, largest = 0;

        System.out.print("Enter the first number: ");
        first = input.nextInt();
        System.out.print("Enter the second number: ");
        second = input.nextInt();
        System.out.print("Enter the third number: ");
        third = input.nextInt();

        if (first == second && first == third) {
            System.out.print("Error enter 3 different numbers.");
            System.exit(0);
        }
        else if (first >= second && first >= third) {
            largest = first;
        }
        else if (second >= first && second >= third) {
            largest = second;
        }
        else {
            largest = third;

        }
        System.out.println("The largest number is "+largest+".");
    }




}

