package task339;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/14/16.
 */
public class Main {
    static final int[] year = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static final int[] year_leap = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pw = new PrintWriter(out);
        String[] line1 = sc.nextLine().split("\\.");
        String[] line2 = sc.nextLine().split("\\.");
        int n = 0;
        int d1 = Integer.valueOf(line1[0]);
        int m1 = Integer.valueOf(line1[1]);
        int y1 = Integer.valueOf(line1[2]);
        int d2 = Integer.valueOf(line2[0]);
        int m2 = Integer.valueOf(line2[1]);
        int y2 = Integer.valueOf(line2[2]);

        if (y1 == y2) {
            n += getDays(d1, m1, d2, m2, isLeapYear(y1)?year_leap:year);
        } else {
            n += getDays(d1, m1, year[11], 12, isLeapYear(y1)?year_leap:year);
            n += getDays(1, 1, d2, m2, isLeapYear(y2)?year_leap:year);
            for (int i=y1+1; i<y2; i++) {
                n += isLeapYear(i)?366:365;
            }
        }
        pw.print(n);
        pw.flush();
    }

    public static int getDays(int d1, int m1, int d2, int m2, int[] y) {
        int days = 0;
        if (m1==m2) {
            days += d2-d1+1;
        } else {
            days += y[m1 - 1] - d1 + 1;
            for (int i = m1 + 1; i < m2; i++) {
                days += y[i - 1];
            }
            days += d2;
        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        return (year%4==0 && year%100!=0) || year%400==0;
    }
}
