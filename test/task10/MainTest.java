package task10;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Created by home on 2/3/16.
 */
public class MainTest {

    @Test
    public void testInit1() throws Exception {
        String inputStr = "1 -3 0 0";
        ByteArrayInputStream in = new ByteArrayInputStream(inputStr.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("0 3 ", out.toString());
    }

    @Test
    public void testInit2() throws Exception {
        String inputStr = "3 -15 18 0";
        ByteArrayInputStream in = new ByteArrayInputStream(inputStr.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("0 2 3 ", out.toString());
    }

    @Test
    public void testInit3() throws Exception {
        String inputStr = "1 -7 -33 135";
        ByteArrayInputStream in = new ByteArrayInputStream(inputStr.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("-5 3 9 ", out.toString());
    }
}