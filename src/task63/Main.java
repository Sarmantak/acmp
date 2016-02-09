package task63;

import java.util.Scanner;

/**
 * Created by almat on 2/7/16.
 * Загадка
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int p = scanner.nextInt();
        int[] result = init(s, p);
        System.out.println(result[0] + " " +result[1]);
    }

    public static int[] init(int s, int p) {
        for (int x=1; x<=1000; x++) {
            int y = s - x;
            if ((x<=y) && (x*y == p)) {
                return new int[] {x, y};
            }
        }
        return null;
    }
}
