package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1016 {

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int start = input.nextInt();
        int sum = 0;

        if (start > 1) {
            for (int i = 1; i <= start; i++) {
                sum = sum + i;
            }
        } else {
            for (int i = start; i <= 1; i++) {
                sum = sum + i;
            }
        }
        out.println(sum);
        out.flush();
    }
}
