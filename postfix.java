import java.util.*;

public class postfix{
    public static int evalPostfix(String expr) {
        Stack<Integer> st = new Stack<>();
        for (String token : expr.split("\\s+")) {
            if (token.matches("-?\\d+")) {
                st.push(Integer.parseInt(token));
            } else {
                int b = st.pop(), a = st.pop();
                switch (token) {
                    case "+": st.push(a + b); break;
                    case "-": st.push(a - b); break;
                    case "*": st.push(a * b); break;
                    case "/": st.push(a / b); break;
                    default: throw new IllegalArgumentException("Unsupported operator " + token);
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String expr = "2 3 1 * + 9 -";
        System.out.println(evalPostfix(expr)); // Output: -4
    }
}
