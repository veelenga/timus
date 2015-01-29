package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class T1409 {

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int hCans = input.nextInt();
        int lCans = input.nextInt();

        out.print(lCans - 1);
        out.print(" ");
        out.println(hCans - 1);
        out.flush();
    }
}
