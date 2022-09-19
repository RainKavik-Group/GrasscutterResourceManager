package Tool;

public class PrintLayerUtil {

    public static String printDefault(int layer, String input) {
        return "    ".repeat(Math.max(0, layer - 1)) + input;
    }
}
