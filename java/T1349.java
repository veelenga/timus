package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1349 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());
        if (n == 1) {
            out.println(1 + " " + 2 + " " + 3);
        } else if (n == 2) {
            out.println(3 + " " + 4 + " " + 5);
        } else {
            out.println(-1);
        }


        out.flush();
    }
}
