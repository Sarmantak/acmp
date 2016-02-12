package task546;

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
        int n = sc.nextInt();
        int k = (n/4)*4+(n%4>0?4:0);
        for (int i=1; i<=k/4; i++) {
            pr.println(i+" 1 "+(n>=(k+2-i*2)?(k+2-i*2):0)+" "+(2*i-1));
            if (n>1)
            pr.println(i+" 2 "+(i*2)+" "+(n>=k-i*2+1?k-i*2+1:0));
        }
        pr.flush();
    }
}
