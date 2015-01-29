package com.noaspace.timus;

import java.io.*;
import java.util.Locale;

public class T1585 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    static final int nextInt() throws Exception {
        //input.nextToken();
        //return (int) input.nval;
        String line = buffer.readLine();
        return Integer.parseInt(line);
    }

    static final String nextLine() throws IOException {
        return buffer.readLine();
    }

    public static void main(String str[]) throws Exception {
        Locale.setDefault(Locale.US);

        final String PG_1 = "Emperor Penguin";
        final String PG_2 = "Little Penguin";
        final String PG_3 = "Macaroni Penguin";

        int n = nextInt();
        Integer count1 = 0;
        Integer count2 = 0;
        Integer count3 = 0;

        for (int i = 0; i < n; i++) {
            String next = nextLine();
            if (next.startsWith("E")) {
                count1++;
            } else if (next.startsWith("L")) {
                count2++;
            } else if (next.startsWith("M")) {
                count3++;
            }
        }

        if (count1 > count2 && count1 > count3) {
            out.println(PG_1);
        } else if (count2 > count1 && count2 > count3) {
            out.println(PG_2);
        }
        if (count3 > count1 && count3 > count2) {
            out.println(PG_3);
        }

        out.flush();
    }
}
