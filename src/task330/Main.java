package task330;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
        PrintWriter pr = new PrintWriter(out);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int t = Math.abs(x1-x2)==Math.abs(y1-y2)?1:2;
        pr.println(t);
        pr.flush();
    }
}
