package dev.himanshu.StriverSDE.StackAndQueue;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String s = "(])";
        boolean ans = isBalanced(s);
        System.out.println(ans);

    }

    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(Character ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if(stack.isEmpty()){
                return false;
            } else{
                char c = stack.peek();
                if((ch == '}' && c == '{') ||
                        (ch == ')' && c == '(') ||
                        (ch == ']' && c == '[')){
                    stack.pop();
                }else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

}
