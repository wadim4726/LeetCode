package LeetCode;

import java.util.Stack;

public class ValidParenheses_20 {

   static public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){System.out.println("❌ Ошибка: лишняя закрывающая скобка"); return false;}

                char top = stack.pop();

                if( (c ==')' && top !='(') ||(c =='}' && top !='{') || (c ==']' && top !='[') ){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
       String s = "([])";
        System.out.println(isValid(s));
    }
}
