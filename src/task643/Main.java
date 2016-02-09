package task643;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/8/16.
 */
public class Main {

    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter wr = new PrintWriter(out);
        int n = sc.nextInt();
        int m = n + Integer.bitCount(n);
        wr.println(m);
        wr.flush();
    }
}
