package task680;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) throws Exception {
        Scanner sc = new Scanner(in);
        PrintWriter pr = new PrintWriter(out);
        int n = sc.nextInt();
        long t = 3*(long)Math.pow(2, n-1);
        pr.print(t);
        pr.flush();
    }
}
