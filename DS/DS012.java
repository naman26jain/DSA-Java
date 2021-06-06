//priority queue usng array
// insert is empty remove max get max functions get




class priorityQueue{
    int capacity;
    int count;
    

    priorityQueue(int n){
        capacity = n;
        count =0;
    }
    int[] queue = new int[7];


    //is empty function
    boolean isEmpty(){
        if(count==0)
            return true;
        return false;    

    }

    //insert function 

    void insert(int p){ 

    if(count ==capacity){
        System.out.println("The queue is full");
    }
    if(isEmpty()){
        queue[count++]=p;
    }
    else{
        int i=0;
        for(i =count-1;i>=0;--i){
            if(queue[i]>p){
                queue[i+1]=queue[i];
                queue[i]=p;
            }
            else{
                break;
            }
        }
        queue[i+1]=p;
        ++count;}
    }

    //remove maximum
    void removeMax(){ 
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        --count;
    }

    //get maximum

    int getMax(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[count-1];
    }
   
}


public class DS012 {

    public static void main(String[] args){

        priorityQueue pq = new priorityQueue(7);

        pq.insert(3);
        pq.insert(10);
        pq.insert(1);
        pq.insert(13);
        pq.insert(9);

        System.out.println(pq.getMax());
        pq.removeMax();
        System.out.println(pq.getMax());
        System.out.println(pq.isEmpty());
    }
    
}
