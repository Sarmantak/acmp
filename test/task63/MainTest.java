package task63;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by almat on 2/7/16.
 */
public class MainTest {

    @Test
    public void testInit1() throws Exception {
        assertArrayEquals(new int[] {2, 2}, Main.init(4, 4));
    }

    @Test
    public void testInit2() throws Exception {
        assertArrayEquals(new int[] {2, 3}, Main.init(5, 6));
    }
}