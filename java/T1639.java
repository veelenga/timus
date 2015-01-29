package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1639 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        int m = input.nextInt();
        int n = input.nextInt();

        int calc = m * n - 1;
        if ((calc & 1) > 0) {
            out.println("[:=[first]");
        } else {
            out.println("[second]=:]");
        }
        out.flush();
    }
}
