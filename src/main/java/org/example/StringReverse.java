package org.example;

import java.util.Stack;

public class StringReverse {

    public static String reverseSupStrings(String s) {
        StringBuilder current = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                 current.reverse();
                current = stack.pop().append('(').append(current).append(')');

            } else {
                current.append(c);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseSupStrings("abd(jnb)asdf(ab)"));
        System.out.println(reverseSupStrings("dd(df)a(ghhh)"));


    }
}
