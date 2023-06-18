package lesson4.HomeWork;

import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("isValid(\"()\") = " + isValid("()"));
        System.out.println("isValid(\"()[]{}\") = " + isValid("()[]{}"));
        System.out.println("isValid(\"(]\") = " + isValid("(]"));
        System.out.println("isValid(\"()[]{}{\") = " + isValid("()[]{}{"));
        System.out.println("isValid(\")\") = " + isValid(")"));
    }

    /**
     * @param s Input string with brackets
     * @return True - if condition is hold true
     * @apiNote Check if string has only open bracket with next same close bracket
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || c != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}

