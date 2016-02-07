package task62;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;

/**
 * Created by almat on 2/7/16.
 */
public class MainTest {

    @Test
    public void testInit1() throws Exception {
        String str = "C3";
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("BLACK", out.toString());
    }

    @Test
    public void testInit2() throws Exception {
        String str = "D1";
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("WHITE", out.toString());
    }
}