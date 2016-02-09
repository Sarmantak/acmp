package task439;

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
        double n = sc.nextDouble();
        double p = sc.nextDouble();
        double x = (100*n)/(100-p+p*n);
        wr.print(x);
        wr.flush();
    }
}
