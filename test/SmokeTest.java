// Compiles and runs one homework program from this course, then checks its
// output as a real assertion rather than trusting javac's exit code alone.
// JClassHomework_21_10_27_1.Main is a self-contained bubble sort over a fixed
// input array, so its correct output is fixed too and can be verified here.
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SmokeTest {
    public static void main(String[] args) throws Exception {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured, true, "UTF-8"));
        try {
            JClassHomework_21_10_27_1.Main.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        String output = captured.toString("UTF-8");
        String expectedAscending = "0\t1\t2\t3\t4\t4\t5\t6\t8\t9";
        if (!output.contains(expectedAscending)) {
            throw new AssertionError(
                "bubble sort output did not contain the expected ascending "
                    + "sequence \"" + expectedAscending + "\"; got: " + output);
        }

        System.out.println(
            "SmokeTest passed: JClassHomework_21_10_27_1.Main sorts ascending as expected.");
    }
}
