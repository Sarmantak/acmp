package task411;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/9/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter wr = new PrintWriter(out);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = b*b - 4*a*c;
        if ((a==0 && b==0 && c!=0) || d<0) {
            wr.print(0);
        } else if (a==0 && b==0) {
            wr.print(-1);
        } else if (a==0) {
            double x = -c/b;
            wr.println(1);
            wr.print(x);
        } else if (d>-1) {
            if (d==0) {
                double x = -b/(2*a);
                wr.println(1);
                wr.print(x);
            } else {
                double x1 = (-b-Math.sqrt(d))/(2*a);
                double x2 = (-b+Math.sqrt(d))/(2*a);
                wr.println(2);
                wr.println(x1);
                wr.print(x2);
            }
        }
        wr.flush();
    }
}
