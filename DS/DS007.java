//implementing stacks using arrays and linked list
import java.util.*;
//implementing stack and its function using arraylist
class ownStack{
    int size;
    ownStack(int s){
        size=s;
    }
    ArrayList<Integer> stack=new ArrayList<Integer>(size);
    int top=-1;

    void push(int data){
        if(top==size){
            System.out.println("Stack overflow");
        }
        
        else{
            stack.add(data);
            top++;
        }
    }
    int pop(){
        int temp;
        if(top==-1){
            System.out.println("Stack is empty underflow");
            return 0;
        }
        else{
            temp=stack.remove(top);
            top--;
        }
        
        return temp;
    }
    int top(){
        if(top==-1){
            System.out.println("Stack is empty underflow");
            return 0;
        }
        else
            return stack.get(top);
    }

}
// for implementation in linked list we do all the operations on the head node ex: to pop we just do head=head.next
public class DS007 {
    public static void main(String[] args){
        //to use stack frameword
       /* Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(12);
        st.push(21);
        System.out.println(st.pop());//to remove element
        System.out.println(st.peek());//to get top most element
        st.push(1);
        st.push(2);
        st.push(12);
        st.push(21);
        System.out.println(st.size());//to get size of stack
        System.out.println(st.search(21));//to get the size of stack*/
        

        //implementing own stack using array or ll
        ownStack stk =new ownStack(5);

        stk.push(12);
        stk.push(11);
        stk.push(13);
        stk.push(14);
        System.out.println(stk.top());
        System.out.println(stk.pop());
        System.out.println(stk.top());

    }
    

}
