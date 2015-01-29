package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1457 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nextInt();
        }

        double result = sum / n;

        out.format("%,.6f", result);
        out.flush();
    }
}
