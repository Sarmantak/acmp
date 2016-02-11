package task520;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/8/16.
 */
public class Main {
    public static void main(String args[]) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter wr = new PrintWriter(out);
        int n = sc.nextInt();
        int a = n/(12*12);
        int r = n%(12*12);
        int b = 0;
        int c = 0;
        if (r>=11*12+2) {
            a++;
        } else {
            b = (n-12*12*a)/12;
            r = (n-12*12*a)%12;
            if (r>=10) {
                b++;
            } else {
                c = (n-12*12*a-12*b);
            }
        }
        wr.print(a + " " + b + " " + c);
        wr.flush();
    }
}
