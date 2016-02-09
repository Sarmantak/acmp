package task645;

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
        int k = sc.nextInt();
        int r = (int) Math.sqrt(k);
        int w = r;
        int m = k;
        int h = r;
        for (int i=r; i<=r+(k-r*r); i++) {
            int w1 = i;
            int h1 = k/w1;
            if (m > Math.abs(w1-h1) + k - w1*h1) {
                m = Math.abs(w1-h1) + k - w1*h1;
                w = w1;
                h = h1;
            }
        }
        wr.print(w + " " + h);
        wr.flush();
    }
}
