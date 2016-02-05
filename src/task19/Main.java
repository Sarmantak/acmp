package task19;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by home on 2/4/16.
 */
public class Main {

    public static void init(InputStream in, OutputStream out) throws Exception {
        Scanner scanner = new Scanner(in);
        char[] c = scanner.nextLine().toCharArray();
        int a = 'A'-1;
        int one = '1'-1;
        int y1 = c[0]-a;
        int x1 = c[1]-one;
        int y2 = c[3]-a;
        int x2 = c[4]-one;
        int y3 = c[6]-a;
        int x3 = c[7]-one;

        out.write("0".getBytes());
        out.flush();
    }
}
