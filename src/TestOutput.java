import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

final class TestOutput {
    private TestOutput() {
    }

    static String captureOutput(ThrowingRunnable runnable) throws Exception {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try (PrintStream capture = new PrintStream(output)) {
            System.setOut(capture);
            runnable.run();
        } finally {
            System.setOut(originalOut);
        }

        return output.toString();
    }
}
