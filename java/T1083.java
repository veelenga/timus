package com.noaspace.timus;

import java.util.Locale;
import java.util.Scanner;

public class T1083 {

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        final int k = input.next().length();

        int dis = n - k;
        while (dis > 0) {
            n *= dis;
            dis -= k;
        }

        System.out.println(n);
    }
}
