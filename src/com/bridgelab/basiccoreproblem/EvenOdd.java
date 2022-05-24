package com.bridgelab.basiccoreproblem;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        System.out.println("enter an year :: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num%2==0)  {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }
}
© 202