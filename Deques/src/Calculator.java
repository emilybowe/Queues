import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

public class Calculator {

    public int evaluate (String input) {
        Deque<String> stack = new ArrayDeque<>();
        String[] tokens = input.split(" ");
        for(String token : tokens) {
            stack.offer(token);
        }
        while (stack.size() > 1) {
            int left = parseInt(stack.pop());
            String operator = stack.pop();
            int right = parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                default:
                    break;
            }
            stack.push(String.valueOf(result));
        }
        return Integer.parseInt(stack.pop());
    }


}
