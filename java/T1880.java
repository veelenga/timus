package com.noaspace.timus;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class T1880 {

    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int n1 = input.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        final int n2 = input.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        final int n3 = input.nextInt();
        int arr3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = input.nextInt();
        }

        LinkedList<Integer> match = new LinkedList<Integer>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] < arr2[j]) {
                    break;
                }
                if (arr1[i] == arr2[j]) {
                    match.addLast(arr1[i]);
                    break;
                }
            }
        }

        int result = 0;
        for (Integer next : match) {

            for (int j = 0; j < n3; j++) {
                if (next < arr3[j]) {
                    break;
                }
                if (next == arr3[j]) {
                    result++;
                }
            }
        }

        out.println(result);
        out.flush();
    }
}
