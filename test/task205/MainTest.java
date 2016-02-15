package task205;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

/**
 * Created by almat on 2/14/16.
 */
public class MainTest {

    @Test
    public void testInit1() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("01:01:01\n48:0:0".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("01:01:01+2 days", out.toString());
    }

    @Test
    public void testInit2() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("01:01:01\n58:119".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("02:01:00", out.toString());
    }

    @Test
    public void testInit3() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("23:59:59\n1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("00:00:00+1 days", out.toString());
    }
}