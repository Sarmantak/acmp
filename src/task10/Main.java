package task10;

import java.io.*;
import java.util.Scanner;

/**
 * Created by home on 2/3/16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) throws Exception {
        Scanner scanner = new Scanner(in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        long d = scanner.nextInt();
        for (int i=-100; i<101; i++) {
            if (equation(a,b,c,i) + d==0)
                out.write((i+" ").getBytes());
        }
        out.flush();
    }

    public static long equation(long a, long b, long c, long x) {
        return a*x*x*x + b*x*x + c*x;
    }
}
