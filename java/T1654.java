package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1654 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        String shifr = buffer.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < shifr.length(); i++) {
            char current = shifr.charAt(i);

            if (result.length() > 0 && result.charAt(result.length() - 1) == current) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(current);
            }

        }
        out.println(result);
        out.flush();
    }
}
