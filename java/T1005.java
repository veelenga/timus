package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1005 {

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        PrintWriter out = new PrintWriter(System.out);
        Scanner input = new Scanner(System.in);

        int numOfStones = input.nextInt();
        int weight[] = new int[numOfStones];

        for (int i = 0; i < numOfStones; i++) {
            weight[i] = input.nextInt();
        }

        final int limit = (1 << numOfStones); // (2^numOfStones)
        int difference = Integer.MAX_VALUE;
        for (int cur = 0; cur < limit; cur++) {

            int suma = 0;
            int sumb = 0;
            int k = cur;

            for (int i = 0; i < numOfStones; i++) {
                if ((k & 1) > 0) {
                    suma += weight[i];
                } else {
                    sumb += weight[i];
                }
                k >>= 1;
            }
            difference = Math.min(difference, Math.abs(suma - sumb));
        }

        out.println(difference);
        out.flush();
    }
}
