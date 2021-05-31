/*Graph data structure implementation.
can be represented in many ways like adjacency matrix and adjacency list

For V vertices size of matrix would be of V*V  Note: Diagonals are zero
for every corresponding posn in matrix if edge is there then one else 0

Below is implementation using list*/
import java.util.*;

public class DS011{
    //bfs
   static void bfs(ArrayList<ArrayList<Integer>> adj,int v,int s){
        boolean visited[]= new boolean[v];
        LinkedList<Integer> q=new LinkedList<Integer>();

        visited[s]=true;
        q.add(s);

        while(q.size() !=0)
        {
            s=q.poll();
            System.out.println(s+" ");

            Iterator<Integer> i = adj.get(s).listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n])
                {
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }    

    public static void main(String[] args){
        int vertices=4;
        ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>(vertices);
        
       for(int i=0;i<vertices;i++){
           graph.add(new ArrayList<Integer>(vertices));
       }

       graph.get(0).add(1);
       graph.get(1).add(0);
       graph.get(0).add(2);
       graph.get(2).add(0);  
       graph.get(2).add(1);
       graph.get(1).add(3);

       bfs(graph,vertices,1);



    }
}