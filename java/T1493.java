package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1493 {

    static final int getNumberSum(int number) {
        int hundred = number / 100;
        return (number - ((hundred << 6) + (hundred << 5) + (hundred << 2))) / 10 + hundred;
    }

    public static void main(String str[]) throws Exception {
        Locale.setDefault(Locale.US);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String numberLine = reader.readLine();
        int firNum = Character.getNumericValue(numberLine.charAt(0)) +
                Character.getNumericValue(numberLine.charAt(1)) +
                Character.getNumericValue(numberLine.charAt(2));

        int secNum = Integer.parseInt(numberLine.substring(3));

        int last = Character.getNumericValue(numberLine.charAt(5));
        int numberSumIncr = getNumberSum(secNum + 1);
        int numberSumDecr = getNumberSum(secNum - 1);
        if (last != 9) {
            numberSumIncr += last + 1;
        }
        if (last == 0) {
            numberSumDecr += 9;
        } else {
            numberSumDecr += last - 1;
        }
        if (firNum == numberSumIncr || firNum == numberSumDecr) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        out.flush();
    }
}
