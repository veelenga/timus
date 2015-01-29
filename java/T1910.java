package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1910 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    private final static double nextNum() throws IOException {
        input.nextToken();
        return input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = (int) nextNum();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) nextNum();
        }

        int msum = 0;
        int position = 0;
        for (int i = 0; i < n - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > msum) {
                msum = sum;
                position = i + 2;
            }
        }

        out.print(msum + " " + position);

        out.flush();
    }
}
