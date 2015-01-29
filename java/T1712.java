package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class T1712 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static int[][] turnRight(int[][] grid, int n) {

        int result[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = grid[i][j];
                if (current == 1) {
                    result[j][n - 1 - i] = 1;
                }
            }
        }
        return result;
    }

    static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                out.print(array[i][j]);
            out.println();
        }
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        final int size = 4;

        String line = "";
        int grid[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            line = buffer.readLine();
            for (int j = 0; j < size; j++) {
                if (((Character) line.charAt(j)).equals('X')) {
                    grid[i][j] = 1;
                }
            }
        }

        Character[][] password = new Character[size][size];

        for (int i = 0; i < size; i++) {
            line = buffer.readLine();
            for (int j = 0; j < size; j++) {
                password[i][j] = line.charAt(j);
            }
        }

        String spassword = "";
        for (int next = 0; next < 4; next++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (grid[i][j] == 1) {
                        spassword += password[i][j];
                    }
                }
            }
            grid = turnRight(grid, size);
        }

        out.println(spassword);
        out.flush();
    }
}
