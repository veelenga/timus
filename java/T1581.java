package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class T1581 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int n = input.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        LinkedList<Integer> convertedList = new LinkedList<Integer>();
        int counter = 1;
        int current = numbers[0];
        for (int i = 1; i < n; i++) {
            if (current == numbers[i]) {
                counter++;
            } else {
                convertedList.addLast(counter);
                convertedList.addLast(current);
                counter = 1;
            }
            current = numbers[i];
        }

        convertedList.addLast(counter);
        convertedList.addLast(current);


        for (Integer value : convertedList) {
            out.print(value);
            out.print(" ");
        }
        out.println();
        out.flush();
    }
}
