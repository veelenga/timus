package com.noaspace.timus;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class T1020 {

    public static class Point {

        public double x;
        public double y;
    }

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static double nextNum() throws IOException {
        input.nextToken();
        return input.nval;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = (int) nextNum();
        double r = nextNum();

        Point centers[] = new Point[n];
        for (int i = 0; i < n; i++) {
            centers[i] = new Point();
            centers[i].x = nextNum();
            centers[i].y = nextNum();

        }

        double result = distance(centers[n - 1], centers[0]) + Math.PI * r * 2;
        for (int i = 0; i < n - 1; i++) {
            result += distance(centers[i], centers[i + 1]);
        }

        out.print(new DecimalFormat("#.##").format(result));
        out.flush();
    }
}
