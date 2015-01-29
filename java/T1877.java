package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1877 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        String s1 = input.next();
        String s2 = input.next();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if ((n1 & 1) == 0 || (n2 & 1) > 0) {
            out.println("yes");
        } else {
            out.println("no");
        }
        out.flush();
    }
}
