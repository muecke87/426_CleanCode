
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

        //+1
        for (final String eachChar : chars) {
            //+2
            if (eachChar != null && ! "".equals(eachChar)) {
                System.out.println(eachChar);
            }
        }
    }
}









