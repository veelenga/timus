package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class T1014 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());

        if (n == 0) {
            out.println(10);
            out.flush();
            return;
        }
        if (n == 1) {
            out.println(1);
            out.flush();
            return;
        }
        List<Integer> num = new ArrayList<Integer>();
        while (n > 1) {
            for (int i = 9; i > 0; i--) {
                if (i == 1) {
                    out.println(-1);
                    out.flush();
                    return;
                }
                if (n % i == 0) {
                    num.add(i);
                    n = n / i;
                    break;
                }
            }
        }
        Collections.sort(num);
        for (Integer p : num) {
            out.print(p);
        }
        out.flush();
    }
}
