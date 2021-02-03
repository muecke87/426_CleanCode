
import java.util.*;
import java.util.stream.Stream;

public class CC {

    private CC() {

    }

    //+1
    public final static void printOneCharacterOnEachLine(final List<String> chars) {
        Optional.ofNullable(chars)
                .map(Collection::stream)
                .orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                //+1
                .filter(item -> !item.isEmpty())
                .forEach(System.out::println);
    }
}









