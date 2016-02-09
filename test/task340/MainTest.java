package task340;

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
        ByteArrayInputStream in = new ByteArrayInputStream("1 2 3\n3 2 1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("Boxes are equal", out.toString());
    }

    @Test
    public void testInit2() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 3\n3 2 1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("The first box is larger than the second one", out.toString());
    }

    @Test
    public void testInit3() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("2 2 3\n3 2 3".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("The first box is smaller than the second one", out.toString());
    }

    @Test
    public void testInit4() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("3 4 5\n2 4 6".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Main.init(in, out);
        assertEquals("Boxes are incomparable", out.toString());
    }
}