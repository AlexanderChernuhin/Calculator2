public class OutputFormatter {
    public static String formatResult(String result) {
        final int MAX_OUTPUT_LENGTH = 40;
        if (result.length() > MAX_OUTPUT_LENGTH) {
            return result.substring(0, MAX_OUTPUT_LENGTH) + "...";
        } else {
            return result;
        }
    }
}
