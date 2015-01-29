package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1792 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        final int n = 7;
        int hem[] = new int[n];
        for (int i = 0; i < n; i++) {
            hem[i] = nextInt();
        }

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if (!(((hem[1] + hem[2] + hem[3]) % 2) == hem[4])) {
            flag1 = true;
        }

        if (!(((hem[0] + hem[2] + hem[3]) % 2) == hem[5])) {
            flag2 = true;
        }

        if (!(((hem[0] + hem[1] + hem[3]) % 2) == hem[6])) {
            flag3 = true;
        }


        if (flag1 && flag2 && flag3) {
            hem[3] = (hem[3] + 1) % 2;
        } else if (flag1 && flag2) {
            hem[2] = (hem[2] + 1) % 2;
        } else if (flag2 && flag3) {
            hem[0] = (hem[0] + 1) % 2;
        } else if (flag1 && flag3) {
            hem[1] = (hem[1] + 1) % 2;
        } else if (flag1) {
            hem[4] = (hem[4] + 1) % 2;
        } else if (flag2) {
            hem[5] = (hem[5] + 1) % 2;
        } else if (flag3) {
            hem[6] = (hem[6] + 1) % 2;
        }

        for (int i = 0; i < n; i++) {
            out.print(hem[i]);
            out.print(" ");
        }
        out.flush();
    }
}
