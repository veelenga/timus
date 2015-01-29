package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1636 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int timeTeam1 = nextInt();
        int timeTeam2 = nextInt();

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int next = nextInt();
            sum += ((next << 4) + (next << 2));
        }
        if ((timeTeam2 - sum) < timeTeam1) {
            out.println("Dirty debug :(");
        } else {
            out.println("No chance.");
        }
        out.flush();
    }
}
