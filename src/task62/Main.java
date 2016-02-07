package task62;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by almat on 2/7/16.
 * Клетки
 */
public class Main {
    public static void main(String args[]) throws Exception {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) throws Exception {
        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine();
        char[] xy = line.toCharArray();

        if ((xy[0] - xy[1]) % 2 == 0) {
            out.write("BLACK".getBytes());
        } else {
            out.write("WHITE".getBytes());
        }
        out.flush();
    }
}
