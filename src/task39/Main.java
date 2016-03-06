package task39;

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
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        int sum = 0;
        int max = a[n-1];
        for (int i=n-1; i>=0; i--) {
            if (max < a[i]) {
                max = a[i];
            }
            sum += max;
        }
        pr.print(sum);
        pr.flush();
    }
}
