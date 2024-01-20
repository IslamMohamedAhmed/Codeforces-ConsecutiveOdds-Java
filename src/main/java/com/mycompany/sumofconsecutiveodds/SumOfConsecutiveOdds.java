/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sumofconsecutiveodds;

import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class SumOfConsecutiveOdds {

    public static void main(String[] args) {
        byte T;
        int mx, mn, sum;
        Scanner scan = new Scanner(System.in);

        T = scan.nextByte();
        int[] x = new int[T];
        int[] y = new int[T];

        for (int i = 0; i < T; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        for (int i = 0; i < T; i++) {
            mx = Math.max(x[i], y[i]);
            mn = Math.min(x[i], y[i]);
            sum = 0;
            for (int j = mn + 1; j < mx; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }

    }
}
