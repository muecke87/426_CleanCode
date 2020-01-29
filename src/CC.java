import com.sun.tools.javac.util.StringUtils;

import java.util.*;

public class CC {

    private CC() {

    }

    public final static void printOneCharacterOnEachLine(final List<String> chars) {
        if (chars == null) {
            return;
        }

        for (final String eachChar : chars) {
            if (eachChar != null && ! "".equals(eachChar)) {
                System.out.println(eachChar);
            }
        }
    }
}









