package com.noaspace.timus;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class T1617 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = nextInt();
        List<Integer> wheels = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            wheels.add(nextInt());
        }

        Collections.sort(wheels);

        int result = 0;
        int counter = 1;
        int previous = wheels.get(0);
        for (int i = 1; i < wheels.size(); i++) {
            int current = wheels.get(i);
            if (current == previous) {
                counter++;
                if (counter == 4) {
                    result++;
                    counter = 0;
                }
            } else {
                counter = 1;
            }

            previous = current;
        }

        out.println(result);
        out.flush();
    }
}
