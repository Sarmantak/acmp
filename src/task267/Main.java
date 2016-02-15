package task267;

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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        n--;
        //int t = (int) (min + Math.max(Math.round((double)(n*max)/(x+y)),Math.round((double)(n*min)/(x+y))));
        int t =
        pw.print(t);
        pw.flush();
    }
}
