import com.sun.tools.javac.util.StringUtils;

import java.util.*;

public class CC {

    private CC() {

    }

    //+1
    public final static void printOneCharacterOnEachLine(final List<String> chars) {
        //+1
        if (chars == null) {
            return;
        }

        List<String> charsCopy = new ArrayList<>(chars);
        charsCopy.removeAll(Arrays.asList(null, ""));

        charsCopy.forEach(System.out::println); // +1
    }
}









