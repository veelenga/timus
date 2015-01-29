package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1607 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int d = nextInt();

        while (a <= c) {
            if (a + b >= c) {
                a = c;
                break;
            }
            a += b;
            c -= d;
        }
        out.println(a);
        out.flush();
    }
}
