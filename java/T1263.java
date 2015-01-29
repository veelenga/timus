package com.noaspace.timus;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class T1263 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);
    static DecimalFormat form = new DecimalFormat("0.00%");

    public static int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void printPercent(double value) {
        out.println(form.format(value));
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = nextInt();
        int m = nextInt();

        int occurence[] = new int[n];
        for (int i = 0; i < m; i++) {
            occurence[nextInt() - 1]++;
        }

        for (int i = 0; i < n; i++) {
            printPercent((double) occurence[i] / m);
        }
        out.flush();
    }
}
