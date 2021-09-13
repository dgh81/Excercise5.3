package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=0, b=0, c=0, n=0;
        Boolean hasInt_a=false, hasInt_b=false, hasInt_c=false, hasInt_n=false;
        Scanner scanner_a = new Scanner(System.in);
        if (scanner_a.hasNextInt()) {
            hasInt_a = true;
            a = scanner_a.nextInt();
        }
        Scanner scanner_b = new Scanner(System.in);
        if (scanner_b.hasNextInt()) {
            hasInt_b = true;
            b = scanner_b.nextInt();
        }
        Scanner scanner_c = new Scanner(System.in);
        if (scanner_c.hasNextInt()) {
            hasInt_c = true;
            c = scanner_c.nextInt();
        }
        Scanner scanner_n = new Scanner(System.in);
        if (scanner_n.hasNextInt()) {
            hasInt_n = true;
            n = scanner_n.nextInt();
        }

        if (hasInt_a && hasInt_b && hasInt_c && hasInt_n) {
            if (n >= 2 && ((Math.pow(a, n) + Math.pow(b, n))==c*n)) {
                System.out.println("Holy smokes, Fermat was wrong!");
            } else {
                System.out.println("No, that doesnt work.");
            }
        }
    }
}
/*

Exercise 3
Fermat’s Last Theorem says that there are no integers a, b, c, and n such that an + bn = cn, except when n ≤ 2.

Write a program named Fermat.java that inputs four integers (a, b, c, and n) and checks to see if Fermat’s theorem holds.
If n is greater than 2 and an + bn = cn, the program should display “Holy smokes, Fermat was wrong!”
Otherwise, the program should display “No, that doesn’t work.”

Hint: You might want to use Math.pow.*/
