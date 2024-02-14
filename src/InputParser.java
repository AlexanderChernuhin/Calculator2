public class InputParser {
    public String[] parseOperands(String input) throws IllegalArgumentException {
            if (!input.matches("\"[^\"]*\"\\s*[+\\-*/]\\s*\"[^\"]*\"")) {
            throw new IllegalArgumentException("Некорректный формат ввода!");
        }
        String[] parts = input.split("\\s*[+\\-*/]\\s*");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Некорректное количество операндов!");
        }
        return parts;
    }

    public String parseOperator(String input) throws IllegalArgumentException {
        String operator = input.replaceAll(".*?([+\\-*/]).*", "$1");
        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Некорректная операция!");
        }
        return operator;
    }
}
