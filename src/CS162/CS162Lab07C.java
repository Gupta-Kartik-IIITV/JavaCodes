package CS162;

import java.util.Stack;

public class CS162Lab07C{

}
class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
        infixToPostfix(exp);
    }

    public static int precedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }


    public static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }

    // The main function to convert infix expression to postfix expression
    public static void infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the scanned character is an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            // If the scanned character is an ‘(‘, push it to the stack.
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is an ‘)’, pop and add to the output string from the stack
            // until an ‘(‘ is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop '('
            }
            // If an operator is scanned
            else {
                while (!stack.isEmpty() && (precedence(s.charAt(i)) < precedence(stack.peek()) ||
                        precedence(s.charAt(i)) == precedence(stack.peek()) &&
                                associativity(s.charAt(i)) == 'L')) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);
    }

    // Driver code

}