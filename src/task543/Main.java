package task543;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/14/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pw = new PrintWriter(out);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int x = (n*(n-1)*w -2*p)/(2*d);
        pw.print(x==0?n:x);
        pw.flush();
    }
}
