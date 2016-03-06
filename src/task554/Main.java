package task554;

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
        int[] a = new int[n+1];
//        int s = n*(n+1)/2 +1;
        a[0] = 1;
        for (int i=1; i<=n; i++)
            a[i] = a[i-1] + i;
        pr.print(a[n]);
        pr.flush();
    }
}
