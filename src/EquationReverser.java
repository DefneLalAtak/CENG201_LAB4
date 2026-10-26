public class EquationReverser {
    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;
        while (i < equation.length()) {
            char c = equation.charAt(i);
            if (Character.isDigit(c)) {
                int start = i;
                while (i < equation.length()
                        && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String number = equation.substring(start, i);
                stack.push(number);
            } else {
                stack.push(String.valueOf(c));
                i++;
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}