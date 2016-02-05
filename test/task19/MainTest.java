package task19;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Created by home on 2/4/16.
 */
public class MainTest {

    @Test
    public void testInit() throws Exception {
        String inputStr = "D1 D3 E5";
        ByteArrayInputStream in = new ByteArrayInputStream(inputStr.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("0", out.toString());
    }
}