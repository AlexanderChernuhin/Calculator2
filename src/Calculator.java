public class Calculator {
    public String calculate(String input) throws IllegalArgumentException, ArithmeticException {
        InputParser parser = new InputParser();
        String[] operands = parser.parseOperands(input);
        String operator = parser.parseOperator(input);

        switch (operator) {
            case "+":
                return operands[0] + operands[1];
            case "-":
                if (operands[0].contains(operands[1])) {
                    return operands[0].replace(operands[1], "");
                } else {
                    return operands[0];
                }
            case "*":
                int num = Integer.parseInt(operands[1]);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < num; i++) {
                    sb.append(operands[0]);
                }
                return sb.toString();
            case "/":
                int divisor = Integer.parseInt(operands[1]);
                if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль!");
                }
                int quotient = operands[0].length() / divisor;
                return operands[0].substring(0, quotient);
            default:
                throw new IllegalArgumentException("Неподдерживаемая операция. Поддерживаемые операции: +, -, *, /");
        }
    }
}
