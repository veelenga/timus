package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class T1567 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        String letters = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<Character, Integer>(letters.length());

        int counter = 1;
        for (int i = 0; i < letters.length(); i++) {
            if (counter == 4) {
                counter = 1;
            }
            Character c = letters.charAt(i);
            map.put(c, counter);
            counter++;
        }

        map.put('.', 1);
        map.put(',', 2);
        map.put('!', 3);
        map.put('_', 1);
        map.put(' ', 1);

        String line = input.nextLine();
        int cost = 0;
        for (int i = 0; i < line.length(); i++) {
            cost += map.get(line.charAt(i));
        }
        out.println(cost);
        out.flush();
    }
}
