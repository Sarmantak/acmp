package task11;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/26/16.
 */
public class Main {

    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pw = new PrintWriter(out);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n+1];
        a[0] = 1;
        for (int i=1; i<=n; i++) {
            int offset = (i-k)>0?(i-k):0;
            for (int j=i-1; j>=offset; j--)
                a[i] += a[j];
        }
        pw.print(a[n]);
        pw.flush();
    }
}
