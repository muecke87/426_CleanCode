import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sandromuggli on 29.01.20.
 */
public class CCTest {

    @Test
    public void shouldPrintOneCharOnEachLineWithNoNullsAndNoBlanks() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ArrayList<String> chars = new ArrayList<>();
        chars.add("H");
        chars.add("E");
        chars.add(null);
        chars.add("L");
        chars.add("L");
        chars.add("");
        chars.add("O");

        String expectedOutput = "H\nE\nL\nL\nO\n";
        CC.printOneCharacterOnEachLine(chars);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void shouldNotChangeParam() {
        ArrayList<String> chars = new ArrayList<>();
        chars.add(null);
        chars.add("");

        ArrayList<String> expectedChars = new ArrayList<>();
        expectedChars.add(null);
        expectedChars.add("");

        CC.printOneCharacterOnEachLine(chars);
        assertEquals(expectedChars, chars);
    }

    @Test
    public void shouldDoNothingIfParamIsNull() {
        CC.printOneCharacterOnEachLine(null);
    }
}
