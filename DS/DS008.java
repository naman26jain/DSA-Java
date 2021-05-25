import java.util.*;
//problems on stacks

public class DS008 {

    //function to check balance parenthesis
    static boolean isBalanced(String expr){
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
            return false;

            switch(x){
                case ')':
                if(stack.peek()=='('){
                    stack.pop();
                    break;
                }
                else{
                    return false;
                    
                }
                case ']':
                if(stack.peek()=='['){
                    stack.pop();
                    break;
                }
                else{
                    return false;
                    
                }
                case '}':
                if(stack.peek()=='{'){
                    stack.pop();
                    break;
                }
                else{
                    return false;
                    
                }
            }
        }
        if(stack.isEmpty())
             return true;
        else
            return false;



    }
    public static void main(String[] args){
        String str= "dw[f){]wfef";
        System.out.println("The parenthesis in the given string are balanced: "+ isBalanced(str));
    }
   
    
}
