package task528;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/10/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pr = new PrintWriter(out);
        long n = sc.nextInt();
        long k = sc.nextInt();
        long s = (long)((n-2)*k*(k+1))/2 + k + 1;
        pr.print(s);
        pr.flush();
    }
}
