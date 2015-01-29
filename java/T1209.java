package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1209 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    private final static int nextNum() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = nextNum();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextNum();
        }

        for (int i = 0; i < n; i++) {
            double d = Math.sqrt(8 * arr[i] - 7);
            if (d == (int) d) {
                out.print(1);
            } else {
                out.print(0);
            }
            out.print(" ");
        }
        out.flush();
    }
}
