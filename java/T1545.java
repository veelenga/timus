package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class T1545 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine());

        List<String> words = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            words.add(buffer.readLine());
        }

        String letter = buffer.readLine();
        List<Integer> indexes = new ArrayList<Integer>(words.size());
        for (int i = 0; i < words.size(); i++) {

            String firstLetter = "";
            firstLetter += words.get(i).charAt(0);
            if (letter.compareTo(firstLetter) == 0) {
                indexes.add(i);
            }
        }

        for (int i = 0; i < indexes.size(); i++) {
            out.println(words.get(indexes.get(i)));
        }

        out.flush();
    }
}
