import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testAppMainRunsDrivingFlow() throws Exception {
        String output = TestOutput.captureOutput(() -> App.main(new String[0]));

        assertTrue(output.contains("0" + System.lineSeparator()));
        assertTrue(output.contains("10" + System.lineSeparator()));
        assertTrue(output.contains("false" + System.lineSeparator()));
    }
}
