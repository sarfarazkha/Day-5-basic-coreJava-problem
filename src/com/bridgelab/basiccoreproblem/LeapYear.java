package com.bridgelab.basiccoreproblem;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter an year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year % 4 == 0)  {
            System.out.println("year in the leap");
        } else {
            System.out.println("year is not a leap");
        }
    }
}
