package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class T1496 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws Exception {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());

        List<String> teams = new ArrayList<String>(n);
        Set<String> result = new HashSet<String>(n);
        for (int i = 0; i < n; i++) {
            String next = buffer.readLine();
            if (teams.contains(next)) {
                result.add(next);
            } else {
                teams.add(next);
            }
        }

        for (String team : result) {
            out.println(team);
        }
        out.flush();
    }
}
