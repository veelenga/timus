package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1787 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int k = input.nextInt();
        final int n = input.nextInt();

        int cars[] = new int[n];
        for (int i = 0; i < n; i++) {
            cars[i] = input.nextInt();
        }

        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += cars[i];
            if ((cur - k) < 0) {
                cur = 0;
            } else {
                cur -= k;
            }
        }
        out.println(cur);
        out.flush();
    }
}
