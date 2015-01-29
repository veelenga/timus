package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class T1001 {

    public static void main(String str[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Stack<Long> stack = new Stack<Long>();

        while (scanner.hasNextLong()) {
            stack.add(scanner.nextLong());
        }
        while (!stack.isEmpty()) {
            System.out.format("%.4f\n", Math.sqrt(stack.pop()));
        }

        out.flush();
    }
}
