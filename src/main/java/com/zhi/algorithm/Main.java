package com.zhi.algorithm;

import java.util.*;

public class Main {
    static int totalRings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            totalRings = n;
            if (n <= 2) {
                System.out.println("D" + n);
                continue;
            }
            D(n);
        }
    }

    static void D(int n) {
        if (n != 0) {
            if (n > 2) D(n - 2);
            if (n == 2) {
                System.out.println("D1,2");
                return;
            }
            System.out.println("D" + n);
            if (n == totalRings) {
                if (n > 2) {
                    U(n - 2);
                }
                return;
            }
            if (n > 2) U(n - 2);
            if (n > 1) D(n - 1);
        }
    }

    static void U(int n) {
        if (n != 0) {
            if (n == 2) {
                System.out.println("U1,2");
                return;
            }
            if (n > 1) U(n - 1);
            if (n > 2) D(n - 2);
            System.out.println("U" + n);
            if (n > 2) U(n - 2);
        }
    }


}