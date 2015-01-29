package com.noaspace.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Locale;

public class T1012 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    //static StreamTokenizer input = new StreamTokenizer ( buffer );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        String sn = buffer.readLine();
        String sk = buffer.readLine();

        int in = Integer.parseInt(sn);
        int ik = Integer.parseInt(sk);

        BigInteger f1 = BigInteger.valueOf(ik - 1);
        BigInteger f2 = BigInteger.valueOf(ik * (ik - 1));
        BigInteger bk1 = BigInteger.valueOf(ik - 1);

        BigInteger sub = null;
        for (int i = 2; i < in; i++) {
            BigInteger next = (f1.add(f2)).multiply(bk1);
            f1 = f2;
            f2 = next;
        }
        out.println(f2);
        out.flush();
    }
}
