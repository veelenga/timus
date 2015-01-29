package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1820 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static final int calcTime(final int time, int n, int k) {
        if (n <= 0) {
            return 0;
        } else if (n < k) {
            return 2 * time;
        } else {
            int appender = 0;
            int n2 = n << 1;
            if (((n2 % k)) > 0) {
                appender = 1;
            }
            return n2 / k + appender;
        }
    }

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        int n = input.nextInt();
        int k = input.nextInt();

        final int time = 1;


        out.println(calcTime(time, n, k));
        out.flush();
    }
}
