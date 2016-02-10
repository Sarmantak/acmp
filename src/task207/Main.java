package task207;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/10/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter wr = new PrintWriter(out);
        int n = sc.nextInt();
        double x = 0;
        double y = 0;
        double sin45 = Math.sin(Math.toRadians(45));
        for (int i=0; i<n; i++) {
            int d = sc.nextInt();
            double v = sc.nextInt();
            switch (d) {
                case 1 : {y+=v; break;}
                case 2 : {y+=v*sin45; x+=v*sin45; break;}
                case 3 : {x+=v; break;}
                case 4 : {y-=v*sin45; x+=v*sin45; break;}
                case 5 : {y-=v; break;}
                case 6 : {y-=v*sin45; x-=v*sin45; break;}
                case 7 : {x-=v; break;}
                case 8 : {y+=v*sin45; x-=v*sin45; break;}
            }
        }
        wr.print(x + " " + y);
        wr.flush();
    }
}
