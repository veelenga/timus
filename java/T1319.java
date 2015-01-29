package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1319 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        input.nextToken();
        int n = (int) input.nval;

        int count = 1;
        int result[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            int curJ = n - i - 1;
            for (int j = 0; j <= i; j++) {
                result[j][curJ++] = count++;
            }
        }

        for (int i = 1; i < n; i++) {
            int curI = i;
            for (int j = n - 1; j >= i; j--) {
                result[curI++][n - j - 1] = count++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(result[i][j]);
                out.print(" ");
            }
            out.println();
        }

        out.flush();
    }
}
