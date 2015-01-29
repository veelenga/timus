package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1313 {

    static StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(System.out);

    static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);


        int n = nextInt();
        int pixels[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pixels[i][j] = nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            int curJ = 0;
            for (int j = i; j >= 0; j--) {
                out.print(pixels[j][curJ++]);
                out.print(" ");
            }
        }

        for (int j = 1; j < n; j++) {
            int curJ = j;
            for (int i = n - 1; i >= j; i--) {
                out.print(pixels[i][curJ++]);
                out.print(" ");
            }
        }

        out.flush();
    }
}
