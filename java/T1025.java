package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class T1025 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        int K = input.nextInt();
        int groups[] = new int[K];
        for (int i = 0; i < K; i++) {
            groups[i] = input.nextInt();
        }
        Arrays.sort(groups);

        int halfSize = (K >> 1) + 1;
        int result = 0;
        for (int i = 0; i < halfSize; i++) {
            result += (groups[i] >> 1) + 1;
        }

        out.println(result);
        out.flush();
    }
}
