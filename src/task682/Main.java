package task682;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by almat on 2/11/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pw = new PrintWriter(out);
        StringBuilder str1 = new StringBuilder("1");
        StringBuilder str2 = new StringBuilder("9");
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            str1.append("0");
            str2.append("9");
        }
        BigInteger a = new BigInteger(str1.toString());
        BigInteger b = new BigInteger(str2.toString());
        a = a.subtract(a.pow(2));
        b = b.pow(2).add(b).add(a).divide(new BigInteger("2"));
        pw.println(b);
        pw.flush();
    }
}
