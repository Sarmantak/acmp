package task19;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by home on 2/4/16.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) throws Exception {
        Scanner scanner = new Scanner(in);
        char[] c = scanner.nextLine().toCharArray();
        int a = 'A'-1;
        int one = '1'-1;
        int x1 = c[0]-a;
        int y1 = c[1]-one;
        int x2 = c[3]-a;
        int y2 = c[4]-one;
        int x3 = c[6]-a;
        int y3 = c[7]-one;
        int totle = 0;
        for (int i=1; i<9; i++)
            for (int j=1; j<9; j++) {
                if (!((y1==i && x1==j) || (y2==i && x2==j) || (y3==i && x3==j))) {
                    if (queenBeats(y1, x1, i, j) || rookBeats(y2, x2, i, j) || knightBeats(y3, x3, i, j)) {
                        totle++;
                    }
                }
            }
        out.write((totle+"").getBytes());
        out.flush();
    }

    public static boolean queenBeats(int y1, int x1, int y2, int x2) {
        if (y1 == y2 || x1 == x2) return true;
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) return true;
        return false;
    }

    public static boolean knightBeats(int y1, int x1, int y2, int x2) {
        if (Math.abs((x2 - x1)*(y2 - y1))==2) {
            return true;
        }
        return false;
    }

    public static boolean rookBeats(int y1, int x1, int y2, int x2) {
        if (y1 == y2 || x1 == x2) return true;
        return false;
    }
}
