//All about Linked List in Java</>
import java.util.*;
 class node{
    int key;
    node next;
    node(int x){
        key=x;
    }
}
class llist{
    node head;
    node tail;
    llist(){
        head=null;
        tail=null;
    }
    //insert at beginning with O(1)
    void insertAtFirst(int x){
        node temp=new node(x);
        temp.next=head;
        head=temp;
        if(tail==null){
            tail=head;
        }
    }
    void insertAtEnd(int x){
        node temp=new node(x);
        temp.next=tail;
        tail=temp;

    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.key);
            temp=temp.next;
        }

    }
}

/*algo to reverse the llist

node current=head;node prev=null
while(corrent !=null){
    node next=current.next;
    current.next==prev;
    prev=current;current=next;
}
head==prev;

recursive algo for reversing the llist

void recRev(node current, node prev){
    if(current==null){
        return;
        if(current.next==null){
            head=current.next;current.next=prev;
            return;
        }
        node next =current.next;
        current.next=prev;
        recRev(next,prev); 
    }
}*/

/* to check if a LL is looped
FLOYDS algorithm
use of two pointers :fast and slow time complexity O(n)
Refer to DS006.java
as in the loop distance decreases and equals to zero
*/

public class DS005 {

   
    public static void main(String[] args) {
     /*   LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(12);
        ll.add(122);
        ll.add(1212);
        ll.add(1, 10);
        ll.addLast(13);

        ll.remove(2);

        System.out.println(ll.size());*/
        llist ll=new llist();
        ll.insertAtFirst(12);
        ll.insertAtFirst(2);
        ll.insertAtFirst(123);
        ll.insertAtEnd(122);
        ll.print();

        
    }

    //making self LinkedList

    
    
}
