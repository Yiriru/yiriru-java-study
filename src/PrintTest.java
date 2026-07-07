import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrintTest {
    @Test
    public void testLog() throws Exception {
        Print print = new Print();

        String output = TestOutput.captureOutput(() -> print.log("Hello"));

        assertEquals("Hello" + System.lineSeparator(), output);
    }

    @Test
    public void testError() throws Exception {
        Print print = new Print();

        String output = TestOutput.captureOutput(() -> print.error("Something failed"));

        assertEquals("ERROR: Something failed" + System.lineSeparator(), output);
    }
}
