package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1082 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {

        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());
        for (int i = 0; i < n; i++) {
            out.print(i);
            out.print(" ");
        }
        out.flush();
    }
}
