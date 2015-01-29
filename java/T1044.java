package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1044 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static int luckyNumbers(int n) {

        int size = 9 * n + 1;
        int count = 0;
        for (int i = 0; i < size; i++) {
            int c = bruteCount(i, n);
            count += c * c;
        }
        return count;
    }

    public static int bruteCount(int sum, int numCount) {
        int result = 0;
        int size = ((int) Math.pow(10, numCount));

        for (int i = 0; i < size; i++) {
            String number = "" + i;
            int currentSum = 0;
            for (int j = 0; j < number.length(); j++) {
                currentSum += Character.digit(number.charAt(j), 10);
            }

            if (currentSum == sum) {
                result++;
            }
        }

        return result;
    }

    public static void main(String str[]) throws Exception {
        Locale.setDefault(Locale.US);

        int n = Integer.parseInt(buffer.readLine()) / 2;

        int result = luckyNumbers(n);
        out.println(result);
        out.flush();
    }
}
