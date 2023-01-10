package com.bridgelab.basiccoreproblem;

import java.util.Scanner;

public class PowerOf2 { 
    private static void printTableOfPowerTwo() {
        int base = 2;
        int N = 31;
        for (int i = 0; i < N; i++) {
            System.out.println("Power of " + base + "^" + i + " is : " + Math.pow(base, i));
        }
    }
    public static void main(String[] args) {
        printTableOfPowerTwo();
    }
}
