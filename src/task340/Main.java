package task340;

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
        Scanner scanner = new Scanner(in);
        PrintWriter writer = new PrintWriter(out);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int low = Math.min(a1, Math.min(b1, c1));
        int high = Math.max(a1, Math.max(b1, c1));
        b1 = a1+b1+c1-low-high;
        a1 = high;
        c1 = low;
        low = Math.min(a2, Math.min(b2, c2));
        high = Math.max(a2, Math.max(b2, c2));
        b2 = a2+b2+c2-low-high;
        a2 = high;
        c2 = low;
        if (a1>=a2 && b1>=b2 && c1>=c2 && a1+b1+c1>a2+b2+c2) {
            writer.print("The first box is larger than the second one");
        } else if (a1<=a2 && b1<=b2 && c1<=c2 && a1+b1+c1<a2+b2+c2) {
            writer.print("The first box is smaller than the second one");
        } else if (a1==a2 && b1==b2 && c1==c2) {
            writer.print("Boxes are equal");
        } else  {
            writer.print("Boxes are incomparable");
        }
        writer.flush();
    }
}
