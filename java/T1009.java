package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1009 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    static int k_base(int n, int k) {
        if (n <= 0) return 1;
        if (n == 1) return k - 1;
        else return (k_base(n - 1, k) + k_base(n - 2, k)) * (k - 1);

    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());
        int k = Integer.parseInt(buffer.readLine());

        out.println(k_base(n, k));
        out.flush();
    }
}
