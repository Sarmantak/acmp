package task677;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/7/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner scnr = new Scanner(in);
        PrintWriter wrtr = new PrintWriter(out);
        int k = scnr.nextInt();
        int m = scnr.nextInt();
        int n = scnr.nextInt();
        int d = scnr.nextInt();
        int x = -1;
        if ((k*n*m - k*n - k*m - n*m) != 0) {
            x = (d * k * n * m) / (k * n * m - k * n - k * m - n * m);
            if (x%k != 0 || x%n != 0 || x%m != 0) {
                x = -1;
            }
        }
        wrtr.print(x>=0?x:-1);
        wrtr.flush();
    }
}
