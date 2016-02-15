package task205;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by almat on 2/14/16.
 */
public class Main {
    public static void main(String[] args) {
        init(System.in, System.out);
    }

    public static void init(InputStream in, OutputStream out) {
        Scanner sc = new Scanner(in);
        PrintWriter pw = new PrintWriter(out);
        String[] line1 = sc.nextLine().split(":");
        String[] line2 = sc.nextLine().split(":");
        int[] curTime = new int[] {Integer.valueOf(line1[2]), Integer.valueOf(line1[1]), Integer.valueOf(line1[0])};
        int[] time = new int[] {60, 60, 24};
        for (int i=0; i<line2.length; i++) {
            curTime[i] += Integer.valueOf(line2[line2.length-i-1]);
        }
        int n = 0;
        for (int i=0; i<3; i++) {
            curTime[i] += n;
            n = curTime[i]/time[i];
            curTime[i] = curTime[i]%time[i];
        }
        pw.print((curTime[2]<10?"0":"")+curTime[2]+":"+(curTime[1]<10?"0":"")+curTime[1]+":"+(curTime[0]<10?"0":"")+curTime[0]+(n>0?"+"+n+" days":""));
        pw.flush();
    }
}
