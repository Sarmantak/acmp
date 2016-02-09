package task312;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/7/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) throws Exception{
        Scanner scanner = new Scanner(in);
        PrintWriter writer = new PrintWriter(out);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();
        int d = a2 - a1;
        int an = a1 + d * (n-1);
        writer.print(an);
        writer.flush();
    }

}
