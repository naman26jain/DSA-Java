//usng queue using the collection framework it is implemented using linked list

import java.util.*;

public class DS009 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());

        Iterator it = queue.iterator();
        while (it.hasNext())
        System.out.print(it.next()+ " ");

    }
    
}
