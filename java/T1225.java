package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1225 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static double nextNum() throws IOException {
        input.nextToken();
        return input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = (int) nextNum();

        out.print(fibo(n) * 2);
        out.flush();
    }

    public static long fibo_r(long n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1 || n <= 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static long fibo(long n) {
        long first = 1;
        long second = 1;
        long result = 0;
        for (int i = 2; i < n; i++) {
            result = second + first;
            first = second;
            second = result;
        }
        return second;
    }
}
