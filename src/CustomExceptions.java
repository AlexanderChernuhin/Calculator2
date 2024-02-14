public class CustomExceptions {
    public static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static class UnsupportedOperationException extends Exception {
        public UnsupportedOperationException(String message) {
            super(message);
        }
    }

    public static class CalculationException extends Exception {
        public CalculationException(String message) {
            super(message);
        }
    }
}
