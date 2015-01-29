package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class T1563 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());
        Set<String> shops = new HashSet<String>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String shop = buffer.readLine();
            if (shops.contains(shop)) {
                result++;
                continue;
            }
            shops.add(shop);
        }

        out.println(result);
        out.flush();
    }
}
