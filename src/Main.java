import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> chars = new ArrayList<>();
        chars.add("H");
        chars.add("E");
        chars.add(null);
        chars.add("L");
        chars.add("L");
        chars.add("");
        chars.add("O");

        System.out.println(chars);
        CC.printOneCharacterOnEachLine(chars);
        CC.printOneCharacterOnEachLineNew(chars);

    }
}
