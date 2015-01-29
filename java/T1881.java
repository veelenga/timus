package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1881 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int h = input.nextInt();
        final int w = input.nextInt();
        final int n = input.nextInt();

        int words[] = new int[n];
        for (int i = 0; i < n; i++) {
            words[i] = input.next().length();
        }

        int lineCounter = 1;
        int totalLL = -1;
        for (int i = 0; i < n; i++) {
            totalLL = totalLL + words[i] + 1;
            if (totalLL > w) {
                lineCounter++;
                totalLL = words[i];
            }
        }

        int result = lineCounter / h;
        if ((lineCounter % h) > 0) {
            result++;
        }

        out.println(result);
        out.flush();
    }
}
